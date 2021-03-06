// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/conversion_upload_service.proto

package com.google.ads.googleads.v2.services;

public final class ConversionUploadServiceProto {
  private ConversionUploadServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_UploadClickConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_UploadClickConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_UploadClickConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_UploadClickConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_UploadCallConversionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_UploadCallConversionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_UploadCallConversionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_UploadCallConversionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_ClickConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_ClickConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CallConversion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CallConversion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_ExternalAttributionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_ExternalAttributionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_ClickConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_ClickConversionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CallConversionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CallConversionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v2/services/conve" +
      "rsion_upload_service.proto\022 google.ads.g" +
      "oogleads.v2.services\032\034google/api/annotat" +
      "ions.proto\032\036google/protobuf/wrappers.pro" +
      "to\032\027google/rpc/status.proto\032\027google/api/" +
      "client.proto\"\254\001\n\035UploadClickConversionsR" +
      "equest\022\023\n\013customer_id\030\001 \001(\t\022F\n\013conversio" +
      "ns\030\002 \003(\01321.google.ads.googleads.v2.servi" +
      "ces.ClickConversion\022\027\n\017partial_failure\030\003" +
      " \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\235\001\n\036UploadCl" +
      "ickConversionsResponse\0221\n\025partial_failur" +
      "e_error\030\001 \001(\0132\022.google.rpc.Status\022H\n\007res" +
      "ults\030\002 \003(\01327.google.ads.googleads.v2.ser" +
      "vices.ClickConversionResult\"\252\001\n\034UploadCa" +
      "llConversionsRequest\022\023\n\013customer_id\030\001 \001(" +
      "\t\022E\n\013conversions\030\002 \003(\01320.google.ads.goog" +
      "leads.v2.services.CallConversion\022\027\n\017part" +
      "ial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010" +
      "\"\233\001\n\035UploadCallConversionsResponse\0221\n\025pa" +
      "rtial_failure_error\030\001 \001(\0132\022.google.rpc.S" +
      "tatus\022G\n\007results\030\002 \003(\01326.google.ads.goog" +
      "leads.v2.services.CallConversionResult\"\256" +
      "\003\n\017ClickConversion\022+\n\005gclid\030\001 \001(\0132\034.goog" +
      "le.protobuf.StringValue\0227\n\021conversion_ac" +
      "tion\030\002 \001(\0132\034.google.protobuf.StringValue" +
      "\022:\n\024conversion_date_time\030\003 \001(\0132\034.google." +
      "protobuf.StringValue\0226\n\020conversion_value" +
      "\030\004 \001(\0132\034.google.protobuf.DoubleValue\0223\n\r" +
      "currency_code\030\005 \001(\0132\034.google.protobuf.St" +
      "ringValue\022.\n\010order_id\030\006 \001(\0132\034.google.pro" +
      "tobuf.StringValue\022\\\n\031external_attributio" +
      "n_data\030\007 \001(\01329.google.ads.googleads.v2.s" +
      "ervices.ExternalAttributionData\"\337\002\n\016Call" +
      "Conversion\022/\n\tcaller_id\030\001 \001(\0132\034.google.p" +
      "rotobuf.StringValue\022:\n\024call_start_date_t" +
      "ime\030\002 \001(\0132\034.google.protobuf.StringValue\022" +
      "7\n\021conversion_action\030\003 \001(\0132\034.google.prot" +
      "obuf.StringValue\022:\n\024conversion_date_time" +
      "\030\004 \001(\0132\034.google.protobuf.StringValue\0226\n\020" +
      "conversion_value\030\005 \001(\0132\034.google.protobuf" +
      ".DoubleValue\0223\n\rcurrency_code\030\006 \001(\0132\034.go" +
      "ogle.protobuf.StringValue\"\236\001\n\027ExternalAt" +
      "tributionData\022A\n\033external_attribution_cr" +
      "edit\030\001 \001(\0132\034.google.protobuf.DoubleValue" +
      "\022@\n\032external_attribution_model\030\002 \001(\0132\034.g" +
      "oogle.protobuf.StringValue\"\271\001\n\025ClickConv" +
      "ersionResult\022+\n\005gclid\030\001 \001(\0132\034.google.pro" +
      "tobuf.StringValue\0227\n\021conversion_action\030\002" +
      " \001(\0132\034.google.protobuf.StringValue\022:\n\024co" +
      "nversion_date_time\030\003 \001(\0132\034.google.protob" +
      "uf.StringValue\"\370\001\n\024CallConversionResult\022" +
      "/\n\tcaller_id\030\001 \001(\0132\034.google.protobuf.Str" +
      "ingValue\022:\n\024call_start_date_time\030\002 \001(\0132\034" +
      ".google.protobuf.StringValue\0227\n\021conversi" +
      "on_action\030\003 \001(\0132\034.google.protobuf.String" +
      "Value\022:\n\024conversion_date_time\030\004 \001(\0132\034.go" +
      "ogle.protobuf.StringValue2\360\003\n\027Conversion" +
      "UploadService\022\334\001\n\026UploadClickConversions" +
      "\022?.google.ads.googleads.v2.services.Uplo" +
      "adClickConversionsRequest\032@.google.ads.g" +
      "oogleads.v2.services.UploadClickConversi" +
      "onsResponse\"?\202\323\344\223\0029\"4/v2/customers/{cust" +
      "omer_id=*}:uploadClickConversions:\001*\022\330\001\n" +
      "\025UploadCallConversions\022>.google.ads.goog" +
      "leads.v2.services.UploadCallConversionsR" +
      "equest\032?.google.ads.googleads.v2.service" +
      "s.UploadCallConversionsResponse\">\202\323\344\223\0028\"" +
      "3/v2/customers/{customer_id=*}:uploadCal" +
      "lConversions:\001*\032\033\312A\030googleads.googleapis" +
      ".comB\203\002\n$com.google.ads.googleads.v2.ser" +
      "vicesB\034ConversionUploadServiceProtoP\001ZHg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v2/services;services\242\002\003GAA\252\002 " +
      "Google.Ads.GoogleAds.V2.Services\312\002 Googl" +
      "e\\Ads\\GoogleAds\\V2\\Services\352\002$Google::Ad" +
      "s::GoogleAds::V2::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_UploadClickConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_UploadClickConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_UploadClickConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_UploadClickConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_UploadClickConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_UploadClickConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_UploadCallConversionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_UploadCallConversionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_UploadCallConversionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Conversions", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_UploadCallConversionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_UploadCallConversionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_UploadCallConversionsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_ClickConversion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_ClickConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_ClickConversion_descriptor,
        new java.lang.String[] { "Gclid", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", "OrderId", "ExternalAttributionData", });
    internal_static_google_ads_googleads_v2_services_CallConversion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v2_services_CallConversion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CallConversion_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", "ConversionValue", "CurrencyCode", });
    internal_static_google_ads_googleads_v2_services_ExternalAttributionData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v2_services_ExternalAttributionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_ExternalAttributionData_descriptor,
        new java.lang.String[] { "ExternalAttributionCredit", "ExternalAttributionModel", });
    internal_static_google_ads_googleads_v2_services_ClickConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v2_services_ClickConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_ClickConversionResult_descriptor,
        new java.lang.String[] { "Gclid", "ConversionAction", "ConversionDateTime", });
    internal_static_google_ads_googleads_v2_services_CallConversionResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v2_services_CallConversionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CallConversionResult_descriptor,
        new java.lang.String[] { "CallerId", "CallStartDateTime", "ConversionAction", "ConversionDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
