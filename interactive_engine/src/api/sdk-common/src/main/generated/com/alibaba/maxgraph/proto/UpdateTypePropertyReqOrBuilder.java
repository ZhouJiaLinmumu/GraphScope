// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/schema.proto

package com.alibaba.maxgraph.proto;

public interface UpdateTypePropertyReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateTypePropertyReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string label = 1;</code>
   */
  java.lang.String getLabel();
  /**
   * <code>optional string label = 1;</code>
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <code>repeated .PropertyDefProto property = 2;</code>
   */
  java.util.List<com.alibaba.maxgraph.proto.PropertyDefProto> 
      getPropertyList();
  /**
   * <code>repeated .PropertyDefProto property = 2;</code>
   */
  com.alibaba.maxgraph.proto.PropertyDefProto getProperty(int index);
  /**
   * <code>repeated .PropertyDefProto property = 2;</code>
   */
  int getPropertyCount();
  /**
   * <code>repeated .PropertyDefProto property = 2;</code>
   */
  java.util.List<? extends com.alibaba.maxgraph.proto.PropertyDefProtoOrBuilder> 
      getPropertyOrBuilderList();
  /**
   * <code>repeated .PropertyDefProto property = 2;</code>
   */
  com.alibaba.maxgraph.proto.PropertyDefProtoOrBuilder getPropertyOrBuilder(
      int index);
}