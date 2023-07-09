// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClimateControlService.proto

package building.climate_control;

/**
 * <pre>
 * Response message containing the status, current temperature, set temperature, and error code of the HVAC system
 * </pre>
 *
 * Protobuf type {@code building.climate_control.HVACConditionResponse}
 */
public  final class HVACConditionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:building.climate_control.HVACConditionResponse)
    HVACConditionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HVACConditionResponse.newBuilder() to construct.
  private HVACConditionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HVACConditionResponse() {
    status_ = false;
    currentTemperature_ = 0F;
    setTemperature_ = 0F;
    errorCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HVACConditionResponse(
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
          case 8: {

            status_ = input.readBool();
            break;
          }
          case 21: {

            currentTemperature_ = input.readFloat();
            break;
          }
          case 29: {

            setTemperature_ = input.readFloat();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            errorCode_ = s;
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
    return building.climate_control.ClimateControlService.internal_static_building_climate_control_HVACConditionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return building.climate_control.ClimateControlService.internal_static_building_climate_control_HVACConditionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            building.climate_control.HVACConditionResponse.class, building.climate_control.HVACConditionResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private boolean status_;
  /**
   * <code>bool status = 1;</code>
   */
  public boolean getStatus() {
    return status_;
  }

  public static final int CURRENT_TEMPERATURE_FIELD_NUMBER = 2;
  private float currentTemperature_;
  /**
   * <code>float current_temperature = 2;</code>
   */
  public float getCurrentTemperature() {
    return currentTemperature_;
  }

  public static final int SET_TEMPERATURE_FIELD_NUMBER = 3;
  private float setTemperature_;
  /**
   * <code>float set_temperature = 3;</code>
   */
  public float getSetTemperature() {
    return setTemperature_;
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 4;
  private volatile java.lang.Object errorCode_;
  /**
   * <code>string error_code = 4;</code>
   */
  public java.lang.String getErrorCode() {
    java.lang.Object ref = errorCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorCode_ = s;
      return s;
    }
  }
  /**
   * <code>string error_code = 4;</code>
   */
  public com.google.protobuf.ByteString
      getErrorCodeBytes() {
    java.lang.Object ref = errorCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorCode_ = b;
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
    if (status_ != false) {
      output.writeBool(1, status_);
    }
    if (currentTemperature_ != 0F) {
      output.writeFloat(2, currentTemperature_);
    }
    if (setTemperature_ != 0F) {
      output.writeFloat(3, setTemperature_);
    }
    if (!getErrorCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, errorCode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, status_);
    }
    if (currentTemperature_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, currentTemperature_);
    }
    if (setTemperature_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, setTemperature_);
    }
    if (!getErrorCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, errorCode_);
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
    if (!(obj instanceof building.climate_control.HVACConditionResponse)) {
      return super.equals(obj);
    }
    building.climate_control.HVACConditionResponse other = (building.climate_control.HVACConditionResponse) obj;

    boolean result = true;
    result = result && (getStatus()
        == other.getStatus());
    result = result && (
        java.lang.Float.floatToIntBits(getCurrentTemperature())
        == java.lang.Float.floatToIntBits(
            other.getCurrentTemperature()));
    result = result && (
        java.lang.Float.floatToIntBits(getSetTemperature())
        == java.lang.Float.floatToIntBits(
            other.getSetTemperature()));
    result = result && getErrorCode()
        .equals(other.getErrorCode());
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (37 * hash) + CURRENT_TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCurrentTemperature());
    hash = (37 * hash) + SET_TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getSetTemperature());
    hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static building.climate_control.HVACConditionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static building.climate_control.HVACConditionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static building.climate_control.HVACConditionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static building.climate_control.HVACConditionResponse parseFrom(
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
  public static Builder newBuilder(building.climate_control.HVACConditionResponse prototype) {
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
   * Response message containing the status, current temperature, set temperature, and error code of the HVAC system
   * </pre>
   *
   * Protobuf type {@code building.climate_control.HVACConditionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:building.climate_control.HVACConditionResponse)
      building.climate_control.HVACConditionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return building.climate_control.ClimateControlService.internal_static_building_climate_control_HVACConditionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return building.climate_control.ClimateControlService.internal_static_building_climate_control_HVACConditionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              building.climate_control.HVACConditionResponse.class, building.climate_control.HVACConditionResponse.Builder.class);
    }

    // Construct using building.climate_control.HVACConditionResponse.newBuilder()
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
      status_ = false;

      currentTemperature_ = 0F;

      setTemperature_ = 0F;

      errorCode_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return building.climate_control.ClimateControlService.internal_static_building_climate_control_HVACConditionResponse_descriptor;
    }

    @java.lang.Override
    public building.climate_control.HVACConditionResponse getDefaultInstanceForType() {
      return building.climate_control.HVACConditionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public building.climate_control.HVACConditionResponse build() {
      building.climate_control.HVACConditionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public building.climate_control.HVACConditionResponse buildPartial() {
      building.climate_control.HVACConditionResponse result = new building.climate_control.HVACConditionResponse(this);
      result.status_ = status_;
      result.currentTemperature_ = currentTemperature_;
      result.setTemperature_ = setTemperature_;
      result.errorCode_ = errorCode_;
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
      if (other instanceof building.climate_control.HVACConditionResponse) {
        return mergeFrom((building.climate_control.HVACConditionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(building.climate_control.HVACConditionResponse other) {
      if (other == building.climate_control.HVACConditionResponse.getDefaultInstance()) return this;
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
      }
      if (other.getCurrentTemperature() != 0F) {
        setCurrentTemperature(other.getCurrentTemperature());
      }
      if (other.getSetTemperature() != 0F) {
        setSetTemperature(other.getSetTemperature());
      }
      if (!other.getErrorCode().isEmpty()) {
        errorCode_ = other.errorCode_;
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
      building.climate_control.HVACConditionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (building.climate_control.HVACConditionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean status_ ;
    /**
     * <code>bool status = 1;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>bool status = 1;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = false;
      onChanged();
      return this;
    }

    private float currentTemperature_ ;
    /**
     * <code>float current_temperature = 2;</code>
     */
    public float getCurrentTemperature() {
      return currentTemperature_;
    }
    /**
     * <code>float current_temperature = 2;</code>
     */
    public Builder setCurrentTemperature(float value) {
      
      currentTemperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float current_temperature = 2;</code>
     */
    public Builder clearCurrentTemperature() {
      
      currentTemperature_ = 0F;
      onChanged();
      return this;
    }

    private float setTemperature_ ;
    /**
     * <code>float set_temperature = 3;</code>
     */
    public float getSetTemperature() {
      return setTemperature_;
    }
    /**
     * <code>float set_temperature = 3;</code>
     */
    public Builder setSetTemperature(float value) {
      
      setTemperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float set_temperature = 3;</code>
     */
    public Builder clearSetTemperature() {
      
      setTemperature_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object errorCode_ = "";
    /**
     * <code>string error_code = 4;</code>
     */
    public java.lang.String getErrorCode() {
      java.lang.Object ref = errorCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error_code = 4;</code>
     */
    public com.google.protobuf.ByteString
        getErrorCodeBytes() {
      java.lang.Object ref = errorCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error_code = 4;</code>
     */
    public Builder setErrorCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error_code = 4;</code>
     */
    public Builder clearErrorCode() {
      
      errorCode_ = getDefaultInstance().getErrorCode();
      onChanged();
      return this;
    }
    /**
     * <code>string error_code = 4;</code>
     */
    public Builder setErrorCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorCode_ = value;
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


    // @@protoc_insertion_point(builder_scope:building.climate_control.HVACConditionResponse)
  }

  // @@protoc_insertion_point(class_scope:building.climate_control.HVACConditionResponse)
  private static final building.climate_control.HVACConditionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new building.climate_control.HVACConditionResponse();
  }

  public static building.climate_control.HVACConditionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HVACConditionResponse>
      PARSER = new com.google.protobuf.AbstractParser<HVACConditionResponse>() {
    @java.lang.Override
    public HVACConditionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HVACConditionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HVACConditionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HVACConditionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public building.climate_control.HVACConditionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
