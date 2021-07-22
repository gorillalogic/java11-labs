package com.gl.launchdarkly.poc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.launchdarkly.sdk.LDUser;
import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.server.Components;
import com.launchdarkly.sdk.server.LDClient;
import com.launchdarkly.sdk.server.LDConfig;
import java.io.IOException;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** LaunchDarkly Basic Testing Scenarios */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LaunchDarklySdkExampleTest {

  private static final Logger LOG = LoggerFactory.getLogger(LaunchDarklySdkExampleTest.class);

  private static final UUID USER_ONE_KEY = UUID.fromString("11000000-0000-0000-0000-000000000000");
  private static final UUID USER_TWO_KEY = UUID.fromString("22000000-0000-0000-0000-000000000000");

  private static final String TEST_SDK_KEY = "sdk-04620095-42a1-49cb-95b5-a6d78db4fc1b";

  private static final URI BASE_URI = URI.create("https://stream.launchdarkly.com");
  private static final URI EVENT_URI = URI.create("https://events.launchdarkly.com");
  private static final URI LD_RELAY_URI = URI.create("http://localhost:8030");

  private static LDClient ldClient;

  /** Example of how to start a LDClient */
  @BeforeAll
  static void setup() {

    LDConfig ldConfig =
        new LDConfig.Builder()
            .dataSource(Components.streamingDataSource().baseURI(BASE_URI))
            .events(Components.sendEvents().baseURI(EVENT_URI))
            .build();

    ldClient = new LDClient(TEST_SDK_KEY, ldConfig);
  }

  /** Example of how to close a LDClient */
  @AfterAll
  static void tearDown() throws IOException {
    ldClient.close();
  }

  @Test
  @Order(1)
  void requestToggleValueToLaunchDarklyAndReturnBooleanValue() {

    LDUser user = new LDUser.Builder(USER_ONE_KEY.toString()).name("John Doe").build();

    final boolean featureFlagValue = ldClient.boolVariation("gl-poc-example-one", user, false);
    LOG.info("Feature Flag value is {}", featureFlagValue);

    assertTrue(featureFlagValue);
  }

  @Test
  @Order(2)
  void requestToggleValueToLaunchDarklyAndReturnJSONValue() {

    LDUser user = new LDUser.Builder(USER_TWO_KEY.toString()).name("Jane Doe").build();

    final LDValue featureFlagValue =
        ldClient.jsonValueVariation(
            "gl-poc-example-two",
            user,
            LDValue.of("{ \"message\": \"I am a JSON default value :)\" }"));

    LOG.info("Feature Flag value is {}", featureFlagValue);

    assertEquals("{\"message\":\"I am the message number one\"}", featureFlagValue.toJsonString());
  }

  @Test
  @Order(3)
  void requestToggleValueWithUserSegmentationRuleToLaunchDarklyAndReturnBooleanValue() {

    LDUser user = new LDUser.Builder(USER_ONE_KEY.toString()).name("John Doe").build();

    final boolean featureFlagValue = ldClient.boolVariation("gl-poc-example-three", user, false);
    LOG.info("Feature Flag value is {}", featureFlagValue);

    assertTrue(featureFlagValue);
  }

  @Test
  @Order(4)
  void requestToggleValueWithRuleToLaunchDarklyAndReturnBooleanValue() {

    LDUser user =
        new LDUser.Builder(USER_ONE_KEY.toString()).name("John Doe").country("Canada").build();

    final boolean featureFlagValue = ldClient.boolVariation("gl-poc-example-four", user, false);
    LOG.info("Feature Flag value is {}", featureFlagValue);

    assertFalse(featureFlagValue);
  }
}
