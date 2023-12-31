// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClimateControlService.proto

package building.climate_control;

/**
 * <pre>
 *message to get current temperature
 * </pre>
 *
 * Protobuf type {@code building.climate_control.CurrentTemperatureRequest}
 */
public  final class CurrentTemperatureRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:building.climate_control.CurrentTemperatureRequest)
    CurrentTemperatureRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CurrentTemperatureRequest.newBuilder() to construct.
  private CurrentTemperatureRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CurrentTemperatureRequest() {
    areaId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CurrentTemperatureRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            areaId_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return building.climate_control.ClimateControlService.internal_static_building_climate_control_CurrentTemperatureRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return building.climate_control.ClimateControlService.internal_static_building_climate_control_CurrentTemperatureRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            building.climate_control.CurrentTemperatureRequest.class, building.climate_control.CurrentTemperatureRequest.Builder.class);
  }

  public static final int AREA_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object areaId_;
  /**
   * <code>string area_id = 1;</code>
   */
  public java.lang.String getAreaId() {
    java.lang.Object ref = areaId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      areaId_ = s;
      return s;
    }
  }
  /**
   * <code>string area_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAreaIdBytes() {
    java.lang.Object ref = areaId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      areaId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getAreaIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, areaId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAreaIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, areaId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof building.climate_control.CurrentTemperatureRequest)) {
      return super.equals(obj);
    }
    building.climate_control.CurrentTemperatureRequest other = (building.climate_control.CurrentTemperatureRequest) obj;

    boolean result = true;
    result = result && getAreaId()
        .equals(other.getAreaId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AREA_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAreaId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static building.climate_control.CurrentTemperatureRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static building.climate_control.CurrentTemperatureRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static building.climate_control.CurrentTemperatureRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(building.climate_control.CurrentTemperatureRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *message to get current temperature
   * </pre>
   *
   * Protobuf type {@code building.climate_control.CurrentTemperatureRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:building.climate_control.CurrentTemperatureRequest)
      building.climate_control.CurrentTemperatureRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return building.climate_control.ClimateControlService.internal_static_building_climate_control_CurrentTemperatureRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return building.climate_control.ClimateControlService.internal_static_building_climate_control_CurrentTemperatureRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              building.climate_control.CurrentTemperatureRequest.class, building.climate_control.CurrentTemperatureRequest.Builder.class);
    }

    // Construct using building.climate_control.CurrentTemperatureRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      areaId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return building.climate_control.ClimateControlService.internal_static_building_climate_control_CurrentTemperatureRequest_descriptor;
    }

    @java.lang.Override
    public building.climate_control.CurrentTemperatureRequest getDefaultInstanceForType() {
      return building.climate_control.CurrentTemperatureRequest.getDefaultInstance();
    }

    @java.lang.Override
    public building.climate_control.CurrentTemperatureRequest build() {
      building.climate_control.CurrentTemperatureRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public building.climate_control.CurrentTemperatureRequest buildPartial() {
      building.climate_control.CurrentTemperatureRequest result = new building.climate_control.CurrentTemperatureRequest(this);
      result.areaId_ = areaId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof building.climate_control.CurrentTemperatureRequest) {
        return mergeFrom((building.climate_control.CurrentTemperatureRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(building.climate_control.CurrentTemperatureRequest other) {
      if (other == building.climate_control.CurrentTemperatureRequest.getDefaultInstance()) return this;
      if (!other.getAreaId().isEmpty()) {
        areaId_ = other.areaId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      building.climate_control.CurrentTemperatureRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (building.climate_control.CurrentTemperatureRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object areaId_ = "";
    /**
     * <code>string area_id = 1;</code>
     */
    public java.lang.String getAreaId() {
      java.lang.Object ref = areaId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        areaId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string area_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAreaIdBytes() {
      java.lang.Object ref = areaId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        areaId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string area_id = 1;</code>
     */
    public Builder setAreaId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      areaId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string area_id = 1;</code>
     */
    public Builder clearAreaId() {
      
      areaId_ = getDefaultInstance().getAreaId();
      onChanged();
      return this;
    }
    /**
     * <code>string area_id = 1;</code>
     */
    public Builder setAreaIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      areaId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:building.climate_control.CurrentTemperatureRequest)
  }

  // @@protoc_insertion_point(class_scope:building.climate_control.CurrentTemperatureRequest)
  private static final building.climate_control.CurrentTemperatureRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new building.climate_control.CurrentTemperatureRequest();
  }

  public static building.climate_control.CurrentTemperatureRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CurrentTemperatureRequest>
      PARSER = new com.google.protobuf.AbstractParser<CurrentTemperatureRequest>() {
    @java.lang.Override
    public CurrentTemperatureRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CurrentTemperatureRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CurrentTemperatureRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CurrentTemperatureRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public building.climate_control.CurrentTemperatureRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

