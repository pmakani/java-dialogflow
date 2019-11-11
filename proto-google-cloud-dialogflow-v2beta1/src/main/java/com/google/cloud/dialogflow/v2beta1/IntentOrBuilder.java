/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface IntentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.Intent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of this intent.
   * Required for [Intents.UpdateIntent][google.cloud.dialogflow.v2beta1.Intents.UpdateIntent] and [Intents.BatchUpdateIntents][google.cloud.dialogflow.v2beta1.Intents.BatchUpdateIntents]
   * methods.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of this intent.
   * Required for [Intents.UpdateIntent][google.cloud.dialogflow.v2beta1.Intents.UpdateIntent] and [Intents.BatchUpdateIntents][google.cloud.dialogflow.v2beta1.Intents.BatchUpdateIntents]
   * methods.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of this intent.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of this intent.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether webhooks are enabled for the intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent.WebhookState webhook_state = 6;</code>
   */
  int getWebhookStateValue();
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether webhooks are enabled for the intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent.WebhookState webhook_state = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.WebhookState getWebhookState();

  /**
   *
   *
   * <pre>
   * The priority of this intent. Higher numbers represent higher
   * priorities.
   * - If the supplied value is unspecified or 0, the service
   *   translates the value to 500,000, which corresponds to the
   *   `Normal` priority in the console.
   * - If the supplied value is negative, the intent is ignored
   *   in runtime detect intent requests.
   * </pre>
   *
   * <code>int32 priority = 3;</code>
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether this is a fallback intent.
   * </pre>
   *
   * <code>bool is_fallback = 4;</code>
   */
  boolean getIsFallback();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether Machine Learning is enabled for the intent.
   * Note: If `ml_enabled` setting is set to false, then this intent is not
   * taken into account during inference in `ML ONLY` match mode. Also,
   * auto-markup in the UI is turned off.
   * DEPRECATED! Please use `ml_disabled` field instead.
   * NOTE: If both `ml_enabled` and `ml_disabled` are either not set or false,
   * then the default value is determined as follows:
   * - Before April 15th, 2018 the default is:
   *   ml_enabled = false / ml_disabled = true.
   * - After April 15th, 2018 the default is:
   *   ml_enabled = true / ml_disabled = false.
   * </pre>
   *
   * <code>bool ml_enabled = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  boolean getMlEnabled();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether Machine Learning is disabled for the intent.
   * Note: If `ml_disabled` setting is set to true, then this intent is not
   * taken into account during inference in `ML ONLY` match mode. Also,
   * auto-markup in the UI is turned off.
   * </pre>
   *
   * <code>bool ml_disabled = 19;</code>
   */
  boolean getMlDisabled();

  /**
   *
   *
   * <pre>
   * Optional. Indicates that this intent ends an interaction. Some integrations
   * (e.g., Actions on Google or Dialogflow phone gateway) use this information
   * to close interaction with an end user. Default is false.
   * </pre>
   *
   * <code>bool end_interaction = 21;</code>
   */
  boolean getEndInteraction();

  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7;</code>
   */
  java.util.List<java.lang.String> getInputContextNamesList();
  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7;</code>
   */
  int getInputContextNamesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7;</code>
   */
  java.lang.String getInputContextNames(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7;</code>
   */
  com.google.protobuf.ByteString getInputContextNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8;</code>
   */
  java.util.List<java.lang.String> getEventsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8;</code>
   */
  int getEventsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8;</code>
   */
  java.lang.String getEvents(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8;</code>
   */
  com.google.protobuf.ByteString getEventsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase training_phrases = 9;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase>
      getTrainingPhrasesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase training_phrases = 9;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase getTrainingPhrases(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase training_phrases = 9;
   * </code>
   */
  int getTrainingPhrasesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase training_phrases = 9;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.TrainingPhraseOrBuilder>
      getTrainingPhrasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase training_phrases = 9;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.TrainingPhraseOrBuilder getTrainingPhrasesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The name of the action associated with the intent.
   * Note: The action name must not contain whitespaces.
   * </pre>
   *
   * <code>string action = 10;</code>
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * Optional. The name of the action associated with the intent.
   * Note: The action name must not contain whitespaces.
   * </pre>
   *
   * <code>string action = 10;</code>
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 11;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> getOutputContextsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getOutputContexts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 11;</code>
   */
  int getOutputContextsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 11;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>
      getOutputContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 11;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getOutputContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether to delete all contexts in the current
   * session when this intent is matched.
   * </pre>
   *
   * <code>bool reset_contexts = 12;</code>
   */
  boolean getResetContexts();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Parameter parameters = 13;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Parameter> getParametersList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Parameter parameters = 13;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Parameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Parameter parameters = 13;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Parameter parameters = 13;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.ParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Parameter parameters = 13;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.ParameterOrBuilder getParametersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message messages = 14;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Message> getMessagesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message messages = 14;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Message getMessages(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message messages = 14;</code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message messages = 14;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder>
      getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message messages = 14;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder getMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.Message.Platform default_response_platforms = 15;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Message.Platform>
      getDefaultResponsePlatformsList();
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.Message.Platform default_response_platforms = 15;
   * </code>
   */
  int getDefaultResponsePlatformsCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.Message.Platform default_response_platforms = 15;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Message.Platform getDefaultResponsePlatforms(
      int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.Message.Platform default_response_platforms = 15;
   * </code>
   */
  java.util.List<java.lang.Integer> getDefaultResponsePlatformsValueList();
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.Message.Platform default_response_platforms = 15;
   * </code>
   */
  int getDefaultResponsePlatformsValue(int index);

  /**
   *
   *
   * <pre>
   * Read-only. The unique identifier of the root intent in the chain of
   * followup intents. It identifies the correct followup intents chain for
   * this intent. We populate this field only in the output.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string root_followup_intent_name = 16;</code>
   */
  java.lang.String getRootFollowupIntentName();
  /**
   *
   *
   * <pre>
   * Read-only. The unique identifier of the root intent in the chain of
   * followup intents. It identifies the correct followup intents chain for
   * this intent. We populate this field only in the output.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string root_followup_intent_name = 16;</code>
   */
  com.google.protobuf.ByteString getRootFollowupIntentNameBytes();

  /**
   *
   *
   * <pre>
   * Read-only after creation. The unique identifier of the parent intent in the
   * chain of followup intents. You can set this field when creating an intent,
   * for example with [CreateIntent][] or [BatchUpdateIntents][], in order to
   * make this intent a followup intent.
   * It identifies the parent followup intent.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string parent_followup_intent_name = 17;</code>
   */
  java.lang.String getParentFollowupIntentName();
  /**
   *
   *
   * <pre>
   * Read-only after creation. The unique identifier of the parent intent in the
   * chain of followup intents. You can set this field when creating an intent,
   * for example with [CreateIntent][] or [BatchUpdateIntents][], in order to
   * make this intent a followup intent.
   * It identifies the parent followup intent.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string parent_followup_intent_name = 17;</code>
   */
  com.google.protobuf.ByteString getParentFollowupIntentNameBytes();

  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo>
      getFollowupIntentInfoList();
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo getFollowupIntentInfo(int index);
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  int getFollowupIntentInfoCount();
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfoOrBuilder>
      getFollowupIntentInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.FollowupIntentInfoOrBuilder
      getFollowupIntentInfoOrBuilder(int index);
}
