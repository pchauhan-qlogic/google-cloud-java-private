// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface InputAudioConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.InputAudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
   */
  int getAudioEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
   */
  com.google.cloud.dialogflow.v2.AudioEncoding getAudioEncoding();

  /**
   *
   *
   * <pre>
   * Required. Sample rate (in Hertz) of the audio content sent in the query.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
   * more details.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  java.util.List<java.lang.String> getPhraseHintsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  int getPhraseHintsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  java.lang.String getPhraseHints(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of phrase hints which are used to boost accuracy
   * of speech recognition.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  com.google.protobuf.ByteString getPhraseHintsBytes(int index);
}
