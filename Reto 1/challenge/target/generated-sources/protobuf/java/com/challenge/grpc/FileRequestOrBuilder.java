// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileTransfer.proto

package com.challenge.grpc;

public interface FileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:filetransfer.FileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string file_name = 1;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string file_name = 1;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>string client_ip = 2;</code>
   * @return The clientIp.
   */
  java.lang.String getClientIp();
  /**
   * <code>string client_ip = 2;</code>
   * @return The bytes for clientIp.
   */
  com.google.protobuf.ByteString
      getClientIpBytes();
}
