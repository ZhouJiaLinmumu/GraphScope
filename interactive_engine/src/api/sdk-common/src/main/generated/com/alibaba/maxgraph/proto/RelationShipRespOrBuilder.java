// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/schema.proto

package com.alibaba.maxgraph.proto;

public interface RelationShipRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RelationShipResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .Response resp = 1;</code>
   */
  boolean hasResp();
  /**
   * <code>optional .Response resp = 1;</code>
   */
  com.alibaba.maxgraph.proto.Response getResp();
  /**
   * <code>optional .Response resp = 1;</code>
   */
  com.alibaba.maxgraph.proto.ResponseOrBuilder getRespOrBuilder();

  /**
   * <code>repeated .RelationShipProto relationShips = 2;</code>
   */
  java.util.List<com.alibaba.maxgraph.proto.RelationShipProto> 
      getRelationShipsList();
  /**
   * <code>repeated .RelationShipProto relationShips = 2;</code>
   */
  com.alibaba.maxgraph.proto.RelationShipProto getRelationShips(int index);
  /**
   * <code>repeated .RelationShipProto relationShips = 2;</code>
   */
  int getRelationShipsCount();
  /**
   * <code>repeated .RelationShipProto relationShips = 2;</code>
   */
  java.util.List<? extends com.alibaba.maxgraph.proto.RelationShipProtoOrBuilder> 
      getRelationShipsOrBuilderList();
  /**
   * <code>repeated .RelationShipProto relationShips = 2;</code>
   */
  com.alibaba.maxgraph.proto.RelationShipProtoOrBuilder getRelationShipsOrBuilder(
      int index);
}
