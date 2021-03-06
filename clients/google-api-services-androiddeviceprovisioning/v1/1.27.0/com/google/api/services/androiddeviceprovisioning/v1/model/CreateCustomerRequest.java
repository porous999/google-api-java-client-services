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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * Request message to create a customer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateCustomerRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The company data to populate the new customer. Must contain a value for `companyName`
   * and at least one `owner_email` that's associated with a Google Account. The values for
   * `companyId` and `name` must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Company customer;

  /**
   * Required. The company data to populate the new customer. Must contain a value for `companyName`
   * and at least one `owner_email` that's associated with a Google Account. The values for
   * `companyId` and `name` must be empty.
   * @return value or {@code null} for none
   */
  public Company getCustomer() {
    return customer;
  }

  /**
   * Required. The company data to populate the new customer. Must contain a value for `companyName`
   * and at least one `owner_email` that's associated with a Google Account. The values for
   * `companyId` and `name` must be empty.
   * @param customer customer or {@code null} for none
   */
  public CreateCustomerRequest setCustomer(Company customer) {
    this.customer = customer;
    return this;
  }

  @Override
  public CreateCustomerRequest set(String fieldName, Object value) {
    return (CreateCustomerRequest) super.set(fieldName, value);
  }

  @Override
  public CreateCustomerRequest clone() {
    return (CreateCustomerRequest) super.clone();
  }

}
