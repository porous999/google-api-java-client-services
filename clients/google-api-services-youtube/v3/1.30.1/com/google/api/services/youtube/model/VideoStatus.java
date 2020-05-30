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

package com.google.api.services.youtube.model;

/**
 * Basic details about a video category, such as its localized title. Next Id: 16
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoStatus extends com.google.api.client.json.GenericJson {

  /**
   * This value indicates if the video can be embedded on another website. @mutable
   * youtube.videos.insert youtube.videos.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean embeddable;

  /**
   * This value explains why a video failed to upload. This property is only present if the
   * uploadStatus property indicates that the upload failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failureReason;

  /**
   * The video's license. @mutable youtube.videos.insert youtube.videos.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String license;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean madeForKids;

  /**
   * The video's privacy status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privacyStatus;

  /**
   * This value indicates if the extended video statistics on the watch page can be viewed by
   * everyone. Note that the view count, likes, etc will still be visible if this is disabled.
   * @mutable youtube.videos.insert youtube.videos.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publicStatsViewable;

  /**
   * The date and time when the video is scheduled to publish. It can be set only if the privacy
   * status of the video is private. The value is specified in ISO 8601 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publishAt;

  /**
   * This value explains why YouTube rejected an uploaded video. This property is only present if
   * the uploadStatus property indicates that the upload was rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rejectionReason;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean selfDeclaredMadeForKids;

  /**
   * The status of the uploaded video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uploadStatus;

  /**
   * This value indicates if the video can be embedded on another website. @mutable
   * youtube.videos.insert youtube.videos.update
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEmbeddable() {
    return embeddable;
  }

  /**
   * This value indicates if the video can be embedded on another website. @mutable
   * youtube.videos.insert youtube.videos.update
   * @param embeddable embeddable or {@code null} for none
   */
  public VideoStatus setEmbeddable(java.lang.Boolean embeddable) {
    this.embeddable = embeddable;
    return this;
  }

  /**
   * This value explains why a video failed to upload. This property is only present if the
   * uploadStatus property indicates that the upload failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getFailureReason() {
    return failureReason;
  }

  /**
   * This value explains why a video failed to upload. This property is only present if the
   * uploadStatus property indicates that the upload failed.
   * @param failureReason failureReason or {@code null} for none
   */
  public VideoStatus setFailureReason(java.lang.String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * The video's license. @mutable youtube.videos.insert youtube.videos.update
   * @return value or {@code null} for none
   */
  public java.lang.String getLicense() {
    return license;
  }

  /**
   * The video's license. @mutable youtube.videos.insert youtube.videos.update
   * @param license license or {@code null} for none
   */
  public VideoStatus setLicense(java.lang.String license) {
    this.license = license;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMadeForKids() {
    return madeForKids;
  }

  /**
   * @param madeForKids madeForKids or {@code null} for none
   */
  public VideoStatus setMadeForKids(java.lang.Boolean madeForKids) {
    this.madeForKids = madeForKids;
    return this;
  }

  /**
   * The video's privacy status.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivacyStatus() {
    return privacyStatus;
  }

  /**
   * The video's privacy status.
   * @param privacyStatus privacyStatus or {@code null} for none
   */
  public VideoStatus setPrivacyStatus(java.lang.String privacyStatus) {
    this.privacyStatus = privacyStatus;
    return this;
  }

  /**
   * This value indicates if the extended video statistics on the watch page can be viewed by
   * everyone. Note that the view count, likes, etc will still be visible if this is disabled.
   * @mutable youtube.videos.insert youtube.videos.update
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublicStatsViewable() {
    return publicStatsViewable;
  }

  /**
   * This value indicates if the extended video statistics on the watch page can be viewed by
   * everyone. Note that the view count, likes, etc will still be visible if this is disabled.
   * @mutable youtube.videos.insert youtube.videos.update
   * @param publicStatsViewable publicStatsViewable or {@code null} for none
   */
  public VideoStatus setPublicStatsViewable(java.lang.Boolean publicStatsViewable) {
    this.publicStatsViewable = publicStatsViewable;
    return this;
  }

  /**
   * The date and time when the video is scheduled to publish. It can be set only if the privacy
   * status of the video is private. The value is specified in ISO 8601 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublishAt() {
    return publishAt;
  }

  /**
   * The date and time when the video is scheduled to publish. It can be set only if the privacy
   * status of the video is private. The value is specified in ISO 8601 format.
   * @param publishAt publishAt or {@code null} for none
   */
  public VideoStatus setPublishAt(java.lang.String publishAt) {
    this.publishAt = publishAt;
    return this;
  }

  /**
   * This value explains why YouTube rejected an uploaded video. This property is only present if
   * the uploadStatus property indicates that the upload was rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getRejectionReason() {
    return rejectionReason;
  }

  /**
   * This value explains why YouTube rejected an uploaded video. This property is only present if
   * the uploadStatus property indicates that the upload was rejected.
   * @param rejectionReason rejectionReason or {@code null} for none
   */
  public VideoStatus setRejectionReason(java.lang.String rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSelfDeclaredMadeForKids() {
    return selfDeclaredMadeForKids;
  }

  /**
   * @param selfDeclaredMadeForKids selfDeclaredMadeForKids or {@code null} for none
   */
  public VideoStatus setSelfDeclaredMadeForKids(java.lang.Boolean selfDeclaredMadeForKids) {
    this.selfDeclaredMadeForKids = selfDeclaredMadeForKids;
    return this;
  }

  /**
   * The status of the uploaded video.
   * @return value or {@code null} for none
   */
  public java.lang.String getUploadStatus() {
    return uploadStatus;
  }

  /**
   * The status of the uploaded video.
   * @param uploadStatus uploadStatus or {@code null} for none
   */
  public VideoStatus setUploadStatus(java.lang.String uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }

  @Override
  public VideoStatus set(String fieldName, Object value) {
    return (VideoStatus) super.set(fieldName, value);
  }

  @Override
  public VideoStatus clone() {
    return (VideoStatus) super.clone();
  }

}
