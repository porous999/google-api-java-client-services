/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.homegraph.v1.model;

/**
 * Response type for the [`Query`](#google.home.graph.v1.HomeGraphApiService.Query) call. This
 * should follow the same format as the Google smart home `action.devices.QUERY`
 * [response](https://developers.google.com/assistant/smarthome/reference/intent/query). # Example
 *
 * ```json {   "requestId": "ff36a3cc-ec34-11e6-b1a0-64510650abcf",   "payload": {     "devices": {
 * "123": {         "on": true,         "online": true       },       "456": {         "on": true,
 * "online": true,         "brightness": 80,         "color": {           "name": "cerulean",
 * "spectrumRGB": 31655         }       }     }   } } ```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the HomeGraph API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QueryResponse extends com.google.api.client.json.GenericJson {

  /**
   * Device states for the devices given in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryResponsePayload payload;

  /**
   * Request ID used for debugging. Copied from the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Device states for the devices given in the request.
   * @return value or {@code null} for none
   */
  public QueryResponsePayload getPayload() {
    return payload;
  }

  /**
   * Device states for the devices given in the request.
   * @param payload payload or {@code null} for none
   */
  public QueryResponse setPayload(QueryResponsePayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Request ID used for debugging. Copied from the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Request ID used for debugging. Copied from the request.
   * @param requestId requestId or {@code null} for none
   */
  public QueryResponse setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public QueryResponse set(String fieldName, Object value) {
    return (QueryResponse) super.set(fieldName, value);
  }

  @Override
  public QueryResponse clone() {
    return (QueryResponse) super.clone();
  }

}
