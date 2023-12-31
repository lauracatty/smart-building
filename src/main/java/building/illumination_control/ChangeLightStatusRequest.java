// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IlluminationManagementService.proto

package building.illumination_control;

/**
 * Protobuf type {@code building.illumination_control.ChangeLightStatusRequest}
 */
public  final class ChangeLightStatusRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:building.illumination_control.ChangeLightStatusRequest)
    ChangeLightStatusRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeLightStatusRequest.newBuilder() to construct.
  private ChangeLightStatusRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeLightStatusRequest() {
    areaId_ = "";
    status_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeLightStatusRequest(
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
          case 16: {

            status_ = input.readBool();
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
    return building.illumination_control.IlluminationManagementServiceOuterClass.internal_static_building_illumination_control_ChangeLightStatusRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return building.illumination_control.IlluminationManagementServiceOuterClass.internal_static_building_illumination_control_ChangeLightStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            building.illumination_control.ChangeLightStatusRequest.class, building.illumination_control.ChangeLightStatusRequest.Builder.class);
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

  public static final int STATUS_FIELD_NUMBER = 2;
  private boolean status_;
  /**
   * <code>bool status = 2;</code>
   */
  public boolean getStatus() {
    return status_;
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
    if (status_ != false) {
      output.writeBool(2, status_);
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
    if (status_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, status_);
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
    if (!(obj instanceof building.illumination_control.ChangeLightStatusRequest)) {
      return super.equals(obj);
    }
    building.illumination_control.ChangeLightStatusRequest other = (building.illumination_control.ChangeLightStatusRequest) obj;

    boolean result = true;
    result = result && getAreaId()
        .equals(other.getAreaId());
    result = result && (getStatus()
        == other.getStatus());
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatus());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static building.illumination_control.ChangeLightStatusRequest parseFrom(
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
  public static Builder newBuilder(building.illumination_control.ChangeLightStatusRequest prototype) {
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
   * Protobuf type {@code building.illumination_control.ChangeLightStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:building.illumination_control.ChangeLightStatusRequest)
      building.illumination_control.ChangeLightStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return building.illumination_control.IlluminationManagementServiceOuterClass.internal_static_building_illumination_control_ChangeLightStatusRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return building.illumination_control.IlluminationManagementServiceOuterClass.internal_static_building_illumination_control_ChangeLightStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              building.illumination_control.ChangeLightStatusRequest.class, building.illumination_control.ChangeLightStatusRequest.Builder.class);
    }

    // Construct using building.illumination_control.ChangeLightStatusRequest.newBuilder()
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

      status_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return building.illumination_control.IlluminationManagementServiceOuterClass.internal_static_building_illumination_control_ChangeLightStatusRequest_descriptor;
    }

    @java.lang.Override
    public building.illumination_control.ChangeLightStatusRequest getDefaultInstanceForType() {
      return building.illumination_control.ChangeLightStatusRequest.getDefaultInstance();
    }

    @java.lang.Override
    public building.illumination_control.ChangeLightStatusRequest build() {
      building.illumination_control.ChangeLightStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public building.illumination_control.ChangeLightStatusRequest buildPartial() {
      building.illumination_control.ChangeLightStatusRequest result = new building.illumination_control.ChangeLightStatusRequest(this);
      result.areaId_ = areaId_;
      result.status_ = status_;
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
      if (other instanceof building.illumination_control.ChangeLightStatusRequest) {
        return mergeFrom((building.illumination_control.ChangeLightStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(building.illumination_control.ChangeLightStatusRequest other) {
      if (other == building.illumination_control.ChangeLightStatusRequest.getDefaultInstance()) return this;
      if (!other.getAreaId().isEmpty()) {
        areaId_ = other.areaId_;
        onChanged();
      }
      if (other.getStatus() != false) {
        setStatus(other.getStatus());
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
      building.illumination_control.ChangeLightStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (building.illumination_control.ChangeLightStatusRequest) e.getUnfinishedMessage();
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

    private boolean status_ ;
    /**
     * <code>bool status = 2;</code>
     */
    public boolean getStatus() {
      return status_;
    }
    /**
     * <code>bool status = 2;</code>
     */
    public Builder setStatus(boolean value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = false;
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


    // @@protoc_insertion_point(builder_scope:building.illumination_control.ChangeLightStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:building.illumination_control.ChangeLightStatusRequest)
  private static final building.illumination_control.ChangeLightStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new building.illumination_control.ChangeLightStatusRequest();
  }

  public static building.illumination_control.ChangeLightStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeLightStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeLightStatusRequest>() {
    @java.lang.Override
    public ChangeLightStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeLightStatusRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeLightStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeLightStatusRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public building.illumination_control.ChangeLightStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

