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

package com.google.api.services.slides.v1.model;

/**
 * The properties of the Page.
 *
 * The page will inherit properties from the parent page. Depending on the page type the hierarchy
 * is defined in either SlideProperties or LayoutProperties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PageProperties extends com.google.api.client.json.GenericJson {

  /**
   * The color scheme of the page. If unset, the color scheme is inherited from a parent page. If
   * the page has no parent, the color scheme uses a default Slides color scheme, matching the
   * defaults in the Slides editor. Only the concrete colors of the first 12 ThemeColorTypes are
   * editable. To update the field, a color scheme containing mappings from all the first 12
   * ThemeColorTypes to their concrete colors must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorScheme colorScheme;

  /**
   * The background fill of the page. If unset, the background fill is inherited from a parent page
   * if it exists. If the page has no parent, then the background fill defaults to the corresponding
   * fill in the Slides editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PageBackgroundFill pageBackgroundFill;

  /**
   * The color scheme of the page. If unset, the color scheme is inherited from a parent page. If
   * the page has no parent, the color scheme uses a default Slides color scheme, matching the
   * defaults in the Slides editor. Only the concrete colors of the first 12 ThemeColorTypes are
   * editable. To update the field, a color scheme containing mappings from all the first 12
   * ThemeColorTypes to their concrete colors must be provided.
   * @return value or {@code null} for none
   */
  public ColorScheme getColorScheme() {
    return colorScheme;
  }

  /**
   * The color scheme of the page. If unset, the color scheme is inherited from a parent page. If
   * the page has no parent, the color scheme uses a default Slides color scheme, matching the
   * defaults in the Slides editor. Only the concrete colors of the first 12 ThemeColorTypes are
   * editable. To update the field, a color scheme containing mappings from all the first 12
   * ThemeColorTypes to their concrete colors must be provided.
   * @param colorScheme colorScheme or {@code null} for none
   */
  public PageProperties setColorScheme(ColorScheme colorScheme) {
    this.colorScheme = colorScheme;
    return this;
  }

  /**
   * The background fill of the page. If unset, the background fill is inherited from a parent page
   * if it exists. If the page has no parent, then the background fill defaults to the corresponding
   * fill in the Slides editor.
   * @return value or {@code null} for none
   */
  public PageBackgroundFill getPageBackgroundFill() {
    return pageBackgroundFill;
  }

  /**
   * The background fill of the page. If unset, the background fill is inherited from a parent page
   * if it exists. If the page has no parent, then the background fill defaults to the corresponding
   * fill in the Slides editor.
   * @param pageBackgroundFill pageBackgroundFill or {@code null} for none
   */
  public PageProperties setPageBackgroundFill(PageBackgroundFill pageBackgroundFill) {
    this.pageBackgroundFill = pageBackgroundFill;
    return this;
  }

  @Override
  public PageProperties set(String fieldName, Object value) {
    return (PageProperties) super.set(fieldName, value);
  }

  @Override
  public PageProperties clone() {
    return (PageProperties) super.clone();
  }

}
