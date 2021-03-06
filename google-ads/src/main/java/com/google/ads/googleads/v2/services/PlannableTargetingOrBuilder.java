// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/reach_plan_service.proto

package com.google.ads.googleads.v2.services;

public interface PlannableTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.PlannableTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange> getAgeRangesList();
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   */
  int getAgeRangesCount();
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   */
  com.google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange getAgeRanges(int index);
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   */
  java.util.List<java.lang.Integer>
  getAgeRangesValueList();
  /**
   * <pre>
   * Allowed plannable age ranges for the product for which metrics will be
   * reported. Actual targeting is computed by mapping this age range onto
   * standard Google common.AgeRangeInfo values.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_ranges = 1;</code>
   */
  int getAgeRangesValue(int index);

  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.GenderInfo genders = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.GenderInfo> 
      getGendersList();
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.GenderInfo genders = 2;</code>
   */
  com.google.ads.googleads.v2.common.GenderInfo getGenders(int index);
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.GenderInfo genders = 2;</code>
   */
  int getGendersCount();
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.GenderInfo genders = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.GenderInfoOrBuilder> 
      getGendersOrBuilderList();
  /**
   * <pre>
   * Targetable genders for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.GenderInfo genders = 2;</code>
   */
  com.google.ads.googleads.v2.common.GenderInfoOrBuilder getGendersOrBuilder(
      int index);

  /**
   * <pre>
   * Targetable devices for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.DeviceInfo devices = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.DeviceInfo> 
      getDevicesList();
  /**
   * <pre>
   * Targetable devices for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.DeviceInfo devices = 3;</code>
   */
  com.google.ads.googleads.v2.common.DeviceInfo getDevices(int index);
  /**
   * <pre>
   * Targetable devices for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.DeviceInfo devices = 3;</code>
   */
  int getDevicesCount();
  /**
   * <pre>
   * Targetable devices for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.DeviceInfo devices = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.DeviceInfoOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <pre>
   * Targetable devices for the ad product.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.DeviceInfo devices = 3;</code>
   */
  com.google.ads.googleads.v2.common.DeviceInfoOrBuilder getDevicesOrBuilder(
      int index);
}
