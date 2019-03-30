// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface StreamingDetectIntentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.StreamingDetectIntentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   */
  java.lang.String getResponseId();
  /**
   *
   *
   * <pre>
   * The unique identifier of the response. It can be used to
   * locate a response in the training example set or for reporting issues.
   * </pre>
   *
   * <code>string response_id = 1;</code>
   */
  com.google.protobuf.ByteString getResponseIdBytes();

  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult recognition_result = 2;</code>
   */
  boolean hasRecognitionResult();
  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult recognition_result = 2;</code>
   */
  com.google.cloud.dialogflow.v2.StreamingRecognitionResult getRecognitionResult();
  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult recognition_result = 2;</code>
   */
  com.google.cloud.dialogflow.v2.StreamingRecognitionResultOrBuilder
      getRecognitionResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The result of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 3;</code>
   */
  boolean hasQueryResult();
  /**
   *
   *
   * <pre>
   * The result of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 3;</code>
   */
  com.google.cloud.dialogflow.v2.QueryResult getQueryResult();
  /**
   *
   *
   * <pre>
   * The result of the conversational query or event processing.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.QueryResult query_result = 3;</code>
   */
  com.google.cloud.dialogflow.v2.QueryResultOrBuilder getQueryResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the status of the webhook request.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 4;</code>
   */
  boolean hasWebhookStatus();
  /**
   *
   *
   * <pre>
   * Specifies the status of the webhook request.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 4;</code>
   */
  com.google.rpc.Status getWebhookStatus();
  /**
   *
   *
   * <pre>
   * Specifies the status of the webhook request.
   * </pre>
   *
   * <code>.google.rpc.Status webhook_status = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getWebhookStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in the request.
   * </pre>
   *
   * <code>bytes output_audio = 5;</code>
   */
  com.google.protobuf.ByteString getOutputAudio();

  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output audio. This
   * field is populated from the agent-level speech synthesizer configuration,
   * if enabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig output_audio_config = 6;</code>
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output audio. This
   * field is populated from the agent-level speech synthesizer configuration,
   * if enabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig output_audio_config = 6;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output audio. This
   * field is populated from the agent-level speech synthesizer configuration,
   * if enabled.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.OutputAudioConfig output_audio_config = 6;</code>
   */
  com.google.cloud.dialogflow.v2.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();
}
