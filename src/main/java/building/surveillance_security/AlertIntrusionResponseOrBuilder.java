// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuildingSurveillanceSecurityService.proto

package building.surveillance_security;

public interface AlertIntrusionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:building.surveillance_security.AlertIntrusionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.building.surveillance_security.AlertIntrusionResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.building.surveillance_security.AlertIntrusionResponse.Status status = 1;</code>
   */
  building.surveillance_security.AlertIntrusionResponse.Status getStatus();

  /**
   * <code>.building.surveillance_security.DateTime timestamp = 2;</code>
   */
  boolean hasTimestamp();
  /**
   * <code>.building.surveillance_security.DateTime timestamp = 2;</code>
   */
  building.surveillance_security.DateTime getTimestamp();
  /**
   * <code>.building.surveillance_security.DateTime timestamp = 2;</code>
   */
  building.surveillance_security.DateTimeOrBuilder getTimestampOrBuilder();
}