// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/websocket/frame_service.proto

package org.wso2.choreo.connect.discovery.service.websocket;

public interface WebSocketFrameResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.mgw_wasm_websocket.v3.WebSocketFrameResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.envoy.extensions.filters.http.mgw_wasm_websocket.v3.WebSocketFrameResponse.Code throttle_state = 1;</code>
   * @return The enum numeric value on the wire for throttleState.
   */
  int getThrottleStateValue();
  /**
   * <code>.envoy.extensions.filters.http.mgw_wasm_websocket.v3.WebSocketFrameResponse.Code throttle_state = 1;</code>
   * @return The throttleState.
   */
  org.wso2.choreo.connect.discovery.service.websocket.WebSocketFrameResponse.Code getThrottleState();

  /**
   * <code>int64 throttle_period = 2;</code>
   * @return The throttlePeriod.
   */
  long getThrottlePeriod();

  /**
   * <code>int32 apim_error_code = 3;</code>
   * @return The apimErrorCode.
   */
  int getApimErrorCode();
}
