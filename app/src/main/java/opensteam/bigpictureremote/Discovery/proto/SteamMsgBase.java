package opensteam.bigpictureremote.Discovery.proto;

public final class SteamMsgBase {
    private SteamMsgBase() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registry.add(SteamMsgBase.msgpoolSoftLimit);
        registry.add(SteamMsgBase.msgpoolHardLimit);
    }
    public interface CMsgProtoBufHeaderOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional fixed64 steamid = 1;
        /**
         * <code>optional fixed64 steamid = 1;</code>
         */
        boolean hasSteamid();
        /**
         * <code>optional fixed64 steamid = 1;</code>
         */
        long getSteamid();
// optional int32 client_sessionid = 2;
        /**
         * <code>optional int32 client_sessionid = 2;</code>
         */
        boolean hasClientSessionid();
        /**
         * <code>optional int32 client_sessionid = 2;</code>
         */
        int getClientSessionid();
// optional uint32 routing_appid = 3;
        /**
         * <code>optional uint32 routing_appid = 3;</code>
         */
        boolean hasRoutingAppid();
        /**
         * <code>optional uint32 routing_appid = 3;</code>
         */
        int getRoutingAppid();
// optional fixed64 jobid_source = 10 [default = 18446744073709551615];
        /**
         * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
         */
        boolean hasJobidSource();
        /**
         * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
         */
        long getJobidSource();
// optional fixed64 jobid_target = 11 [default = 18446744073709551615];
        /**
         * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
         */
        boolean hasJobidTarget();
        /**
         * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
         */
        long getJobidTarget();
// optional string target_job_name = 12;
        /**
         * <code>optional string target_job_name = 12;</code>
         */
        boolean hasTargetJobName();
        /**
         * <code>optional string target_job_name = 12;</code>
         */
        java.lang.String getTargetJobName();
        /**
         * <code>optional string target_job_name = 12;</code>
         */
        com.google.protobuf.ByteString
        getTargetJobNameBytes();
// optional int32 seq_num = 24;
        /**
         * <code>optional int32 seq_num = 24;</code>
         */
        boolean hasSeqNum();
        /**
         * <code>optional int32 seq_num = 24;</code>
         */
        int getSeqNum();
// optional int32 eresult = 13 [default = 2];
        /**
         * <code>optional int32 eresult = 13 [default = 2];</code>
         */
        boolean hasEresult();
        /**
         * <code>optional int32 eresult = 13 [default = 2];</code>
         */
        int getEresult();
// optional string error_message = 14;
        /**
         * <code>optional string error_message = 14;</code>
         */
        boolean hasErrorMessage();
        /**
         * <code>optional string error_message = 14;</code>
         */
        java.lang.String getErrorMessage();
        /**
         * <code>optional string error_message = 14;</code>
         */
        com.google.protobuf.ByteString
        getErrorMessageBytes();
// optional uint32 ip = 15;
        /**
         * <code>optional uint32 ip = 15;</code>
         */
        boolean hasIp();
        /**
         * <code>optional uint32 ip = 15;</code>
         */
        int getIp();
// optional uint32 auth_account_flags = 16;
        /**
         * <code>optional uint32 auth_account_flags = 16;</code>
         */
        boolean hasAuthAccountFlags();
        /**
         * <code>optional uint32 auth_account_flags = 16;</code>
         */
        int getAuthAccountFlags();
// optional uint32 token_source = 22;
        /**
         * <code>optional uint32 token_source = 22;</code>
         */
        boolean hasTokenSource();
        /**
         * <code>optional uint32 token_source = 22;</code>
         */
        int getTokenSource();
// optional bool admin_spoofing_user = 23;
        /**
         * <code>optional bool admin_spoofing_user = 23;</code>
         */
        boolean hasAdminSpoofingUser();
        /**
         * <code>optional bool admin_spoofing_user = 23;</code>
         */
        boolean getAdminSpoofingUser();
// optional int32 transport_error = 17 [default = 1];
        /**
         * <code>optional int32 transport_error = 17 [default = 1];</code>
         */
        boolean hasTransportError();
        /**
         * <code>optional int32 transport_error = 17 [default = 1];</code>
         */
        int getTransportError();
// optional uint64 messageid = 18 [default = 18446744073709551615];
        /**
         * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
         */
        boolean hasMessageid();
        /**
         * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
         */
        long getMessageid();
// optional uint32 publisher_group_id = 19;
        /**
         * <code>optional uint32 publisher_group_id = 19;</code>
         */
        boolean hasPublisherGroupId();
        /**
         * <code>optional uint32 publisher_group_id = 19;</code>
         */
        int getPublisherGroupId();
// optional uint32 sysid = 20;
        /**
         * <code>optional uint32 sysid = 20;</code>
         */
        boolean hasSysid();
        /**
         * <code>optional uint32 sysid = 20;</code>
         */
        int getSysid();
// optional uint64 trace_tag = 21;
        /**
         * <code>optional uint64 trace_tag = 21;</code>
         */
        boolean hasTraceTag();
        /**
         * <code>optional uint64 trace_tag = 21;</code>
         */
        long getTraceTag();
    }
    /**
     * Protobuf type {@code CMsgProtoBufHeader}
     */
    public static final class CMsgProtoBufHeader extends
            com.google.protobuf.GeneratedMessage
            implements CMsgProtoBufHeaderOrBuilder {
        // Use CMsgProtoBufHeader.newBuilder() to construct.
        private CMsgProtoBufHeader(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgProtoBufHeader(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgProtoBufHeader defaultInstance;
        public static CMsgProtoBufHeader getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgProtoBufHeader getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgProtoBufHeader(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 9: {
                            bitField0_ |= 0x00000001;
                            steamid_ = input.readFixed64();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            clientSessionid_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            routingAppid_ = input.readUInt32();
                            break;
                        }
                        case 81: {
                            bitField0_ |= 0x00000008;
                            jobidSource_ = input.readFixed64();
                            break;
                        }
                        case 89: {
                            bitField0_ |= 0x00000010;
                            jobidTarget_ = input.readFixed64();
                            break;
                        }
                        case 98: {
                            bitField0_ |= 0x00000020;
                            targetJobName_ = input.readBytes();
                            break;
                        }
                        case 104: {
                            bitField0_ |= 0x00000080;
                            eresult_ = input.readInt32();
                            break;
                        }
                        case 114: {
                            bitField0_ |= 0x00000100;
                            errorMessage_ = input.readBytes();
                            break;
                        }
                        case 120: {
                            bitField0_ |= 0x00000200;
                            ip_ = input.readUInt32();
                            break;
                        }
                        case 128: {
                            bitField0_ |= 0x00000400;
                            authAccountFlags_ = input.readUInt32();
                            break;
                        }
                        case 136: {
                            bitField0_ |= 0x00002000;
                            transportError_ = input.readInt32();
                            break;
                        }
                        case 144: {
                            bitField0_ |= 0x00004000;
                            messageid_ = input.readUInt64();
                            break;
                        }
                        case 152: {
                            bitField0_ |= 0x00008000;
                            publisherGroupId_ = input.readUInt32();
                            break;
                        }
                        case 160: {
                            bitField0_ |= 0x00010000;
                            sysid_ = input.readUInt32();
                            break;
                        }
                        case 168: {
                            bitField0_ |= 0x00020000;
                            traceTag_ = input.readUInt64();
                            break;
                        }
                        case 176: {
                            bitField0_ |= 0x00000800;
                            tokenSource_ = input.readUInt32();
                            break;
                        }
                        case 184: {
                            bitField0_ |= 0x00001000;
                            adminSpoofingUser_ = input.readBool();
                            break;
                        }
                        case 192: {
                            bitField0_ |= 0x00000040;
                            seqNum_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgBase.internal_static_CMsgProtoBufHeader_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgBase.internal_static_CMsgProtoBufHeader_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgBase.CMsgProtoBufHeader.class, SteamMsgBase.CMsgProtoBufHeader.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgProtoBufHeader> PARSER =
                new com.google.protobuf.AbstractParser<CMsgProtoBufHeader>() {
                    public CMsgProtoBufHeader parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgProtoBufHeader(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgProtoBufHeader> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional fixed64 steamid = 1;
        public static final int STEAMID_FIELD_NUMBER = 1;
        private long steamid_;
        /**
         * <code>optional fixed64 steamid = 1;</code>
         */
        public boolean hasSteamid() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional fixed64 steamid = 1;</code>
         */
        public long getSteamid() {
            return steamid_;
        }
        // optional int32 client_sessionid = 2;
        public static final int CLIENT_SESSIONID_FIELD_NUMBER = 2;
        private int clientSessionid_;
        /**
         * <code>optional int32 client_sessionid = 2;</code>
         */
        public boolean hasClientSessionid() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int32 client_sessionid = 2;</code>
         */
        public int getClientSessionid() {
            return clientSessionid_;
        }
        // optional uint32 routing_appid = 3;
        public static final int ROUTING_APPID_FIELD_NUMBER = 3;
        private int routingAppid_;
        /**
         * <code>optional uint32 routing_appid = 3;</code>
         */
        public boolean hasRoutingAppid() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint32 routing_appid = 3;</code>
         */
        public int getRoutingAppid() {
            return routingAppid_;
        }
        // optional fixed64 jobid_source = 10 [default = 18446744073709551615];
        public static final int JOBID_SOURCE_FIELD_NUMBER = 10;
        private long jobidSource_;
        /**
         * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
         */
        public boolean hasJobidSource() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
         */
        public long getJobidSource() {
            return jobidSource_;
        }
        // optional fixed64 jobid_target = 11 [default = 18446744073709551615];
        public static final int JOBID_TARGET_FIELD_NUMBER = 11;
        private long jobidTarget_;
        /**
         * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
         */
        public boolean hasJobidTarget() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
         */
        public long getJobidTarget() {
            return jobidTarget_;
        }
        // optional string target_job_name = 12;
        public static final int TARGET_JOB_NAME_FIELD_NUMBER = 12;
        private java.lang.Object targetJobName_;
        /**
         * <code>optional string target_job_name = 12;</code>
         */
        public boolean hasTargetJobName() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional string target_job_name = 12;</code>
         */
        public java.lang.String getTargetJobName() {
            java.lang.Object ref = targetJobName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    targetJobName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string target_job_name = 12;</code>
         */
        public com.google.protobuf.ByteString
        getTargetJobNameBytes() {
            java.lang.Object ref = targetJobName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                targetJobName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional int32 seq_num = 24;
        public static final int SEQ_NUM_FIELD_NUMBER = 24;
        private int seqNum_;
        /**
         * <code>optional int32 seq_num = 24;</code>
         */
        public boolean hasSeqNum() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional int32 seq_num = 24;</code>
         */
        public int getSeqNum() {
            return seqNum_;
        }
        // optional int32 eresult = 13 [default = 2];
        public static final int ERESULT_FIELD_NUMBER = 13;
        private int eresult_;
        /**
         * <code>optional int32 eresult = 13 [default = 2];</code>
         */
        public boolean hasEresult() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional int32 eresult = 13 [default = 2];</code>
         */
        public int getEresult() {
            return eresult_;
        }
        // optional string error_message = 14;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 14;
        private java.lang.Object errorMessage_;
        /**
         * <code>optional string error_message = 14;</code>
         */
        public boolean hasErrorMessage() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>optional string error_message = 14;</code>
         */
        public java.lang.String getErrorMessage() {
            java.lang.Object ref = errorMessage_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    errorMessage_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string error_message = 14;</code>
         */
        public com.google.protobuf.ByteString
        getErrorMessageBytes() {
            java.lang.Object ref = errorMessage_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                errorMessage_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional uint32 ip = 15;
        public static final int IP_FIELD_NUMBER = 15;
        private int ip_;
        /**
         * <code>optional uint32 ip = 15;</code>
         */
        public boolean hasIp() {
            return ((bitField0_ & 0x00000200) == 0x00000200);
        }
        /**
         * <code>optional uint32 ip = 15;</code>
         */
        public int getIp() {
            return ip_;
        }
        // optional uint32 auth_account_flags = 16;
        public static final int AUTH_ACCOUNT_FLAGS_FIELD_NUMBER = 16;
        private int authAccountFlags_;
        /**
         * <code>optional uint32 auth_account_flags = 16;</code>
         */
        public boolean hasAuthAccountFlags() {
            return ((bitField0_ & 0x00000400) == 0x00000400);
        }
        /**
         * <code>optional uint32 auth_account_flags = 16;</code>
         */
        public int getAuthAccountFlags() {
            return authAccountFlags_;
        }
        // optional uint32 token_source = 22;
        public static final int TOKEN_SOURCE_FIELD_NUMBER = 22;
        private int tokenSource_;
        /**
         * <code>optional uint32 token_source = 22;</code>
         */
        public boolean hasTokenSource() {
            return ((bitField0_ & 0x00000800) == 0x00000800);
        }
        /**
         * <code>optional uint32 token_source = 22;</code>
         */
        public int getTokenSource() {
            return tokenSource_;
        }
        // optional bool admin_spoofing_user = 23;
        public static final int ADMIN_SPOOFING_USER_FIELD_NUMBER = 23;
        private boolean adminSpoofingUser_;
        /**
         * <code>optional bool admin_spoofing_user = 23;</code>
         */
        public boolean hasAdminSpoofingUser() {
            return ((bitField0_ & 0x00001000) == 0x00001000);
        }
        /**
         * <code>optional bool admin_spoofing_user = 23;</code>
         */
        public boolean getAdminSpoofingUser() {
            return adminSpoofingUser_;
        }
        // optional int32 transport_error = 17 [default = 1];
        public static final int TRANSPORT_ERROR_FIELD_NUMBER = 17;
        private int transportError_;
        /**
         * <code>optional int32 transport_error = 17 [default = 1];</code>
         */
        public boolean hasTransportError() {
            return ((bitField0_ & 0x00002000) == 0x00002000);
        }
        /**
         * <code>optional int32 transport_error = 17 [default = 1];</code>
         */
        public int getTransportError() {
            return transportError_;
        }
        // optional uint64 messageid = 18 [default = 18446744073709551615];
        public static final int MESSAGEID_FIELD_NUMBER = 18;
        private long messageid_;
        /**
         * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
         */
        public boolean hasMessageid() {
            return ((bitField0_ & 0x00004000) == 0x00004000);
        }
        /**
         * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
         */
        public long getMessageid() {
            return messageid_;
        }
        // optional uint32 publisher_group_id = 19;
        public static final int PUBLISHER_GROUP_ID_FIELD_NUMBER = 19;
        private int publisherGroupId_;
        /**
         * <code>optional uint32 publisher_group_id = 19;</code>
         */
        public boolean hasPublisherGroupId() {
            return ((bitField0_ & 0x00008000) == 0x00008000);
        }
        /**
         * <code>optional uint32 publisher_group_id = 19;</code>
         */
        public int getPublisherGroupId() {
            return publisherGroupId_;
        }
        // optional uint32 sysid = 20;
        public static final int SYSID_FIELD_NUMBER = 20;
        private int sysid_;
        /**
         * <code>optional uint32 sysid = 20;</code>
         */
        public boolean hasSysid() {
            return ((bitField0_ & 0x00010000) == 0x00010000);
        }
        /**
         * <code>optional uint32 sysid = 20;</code>
         */
        public int getSysid() {
            return sysid_;
        }
        // optional uint64 trace_tag = 21;
        public static final int TRACE_TAG_FIELD_NUMBER = 21;
        private long traceTag_;
        /**
         * <code>optional uint64 trace_tag = 21;</code>
         */
        public boolean hasTraceTag() {
            return ((bitField0_ & 0x00020000) == 0x00020000);
        }
        /**
         * <code>optional uint64 trace_tag = 21;</code>
         */
        public long getTraceTag() {
            return traceTag_;
        }
        private void initFields() {
            steamid_ = 0L;
            clientSessionid_ = 0;
            routingAppid_ = 0;
            jobidSource_ = -1L;
            jobidTarget_ = -1L;
            targetJobName_ = "";
            seqNum_ = 0;
            eresult_ = 2;
            errorMessage_ = "";
            ip_ = 0;
            authAccountFlags_ = 0;
            tokenSource_ = 0;
            adminSpoofingUser_ = false;
            transportError_ = 1;
            messageid_ = -1L;
            publisherGroupId_ = 0;
            sysid_ = 0;
            traceTag_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeFixed64(1, steamid_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, clientSessionid_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt32(3, routingAppid_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeFixed64(10, jobidSource_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeFixed64(11, jobidTarget_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBytes(12, getTargetJobNameBytes());
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeInt32(13, eresult_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                output.writeBytes(14, getErrorMessageBytes());
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                output.writeUInt32(15, ip_);
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                output.writeUInt32(16, authAccountFlags_);
            }
            if (((bitField0_ & 0x00002000) == 0x00002000)) {
                output.writeInt32(17, transportError_);
            }
            if (((bitField0_ & 0x00004000) == 0x00004000)) {
                output.writeUInt64(18, messageid_);
            }
            if (((bitField0_ & 0x00008000) == 0x00008000)) {
                output.writeUInt32(19, publisherGroupId_);
            }
            if (((bitField0_ & 0x00010000) == 0x00010000)) {
                output.writeUInt32(20, sysid_);
            }
            if (((bitField0_ & 0x00020000) == 0x00020000)) {
                output.writeUInt64(21, traceTag_);
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                output.writeUInt32(22, tokenSource_);
            }
            if (((bitField0_ & 0x00001000) == 0x00001000)) {
                output.writeBool(23, adminSpoofingUser_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeInt32(24, seqNum_);
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFixed64Size(1, steamid_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, clientSessionid_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, routingAppid_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFixed64Size(10, jobidSource_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFixed64Size(11, jobidTarget_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(12, getTargetJobNameBytes());
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(13, eresult_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(14, getErrorMessageBytes());
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(15, ip_);
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(16, authAccountFlags_);
            }
            if (((bitField0_ & 0x00002000) == 0x00002000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(17, transportError_);
            }
            if (((bitField0_ & 0x00004000) == 0x00004000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(18, messageid_);
            }
            if (((bitField0_ & 0x00008000) == 0x00008000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(19, publisherGroupId_);
            }
            if (((bitField0_ & 0x00010000) == 0x00010000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(20, sysid_);
            }
            if (((bitField0_ & 0x00020000) == 0x00020000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(21, traceTag_);
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(22, tokenSource_);
            }
            if (((bitField0_ & 0x00001000) == 0x00001000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(23, adminSpoofingUser_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(24, seqNum_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }
        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgProtoBufHeader parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgBase.CMsgProtoBufHeader prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }
        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CMsgProtoBufHeader}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgBase.CMsgProtoBufHeaderOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgBase.internal_static_CMsgProtoBufHeader_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgBase.internal_static_CMsgProtoBufHeader_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgBase.CMsgProtoBufHeader.class, SteamMsgBase.CMsgProtoBufHeader.Builder.class);
            }
            // Construct using SteamMsgBase.CMsgProtoBufHeader.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }
            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                steamid_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                clientSessionid_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                routingAppid_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                jobidSource_ = -1L;
                bitField0_ = (bitField0_ & ~0x00000008);
                jobidTarget_ = -1L;
                bitField0_ = (bitField0_ & ~0x00000010);
                targetJobName_ = "";
                bitField0_ = (bitField0_ & ~0x00000020);
                seqNum_ = 0;
                bitField0_ = (bitField0_ & ~0x00000040);
                eresult_ = 2;
                bitField0_ = (bitField0_ & ~0x00000080);
                errorMessage_ = "";
                bitField0_ = (bitField0_ & ~0x00000100);
                ip_ = 0;
                bitField0_ = (bitField0_ & ~0x00000200);
                authAccountFlags_ = 0;
                bitField0_ = (bitField0_ & ~0x00000400);
                tokenSource_ = 0;
                bitField0_ = (bitField0_ & ~0x00000800);
                adminSpoofingUser_ = false;
                bitField0_ = (bitField0_ & ~0x00001000);
                transportError_ = 1;
                bitField0_ = (bitField0_ & ~0x00002000);
                messageid_ = -1L;
                bitField0_ = (bitField0_ & ~0x00004000);
                publisherGroupId_ = 0;
                bitField0_ = (bitField0_ & ~0x00008000);
                sysid_ = 0;
                bitField0_ = (bitField0_ & ~0x00010000);
                traceTag_ = 0L;
                bitField0_ = (bitField0_ & ~0x00020000);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgBase.internal_static_CMsgProtoBufHeader_descriptor;
            }
            public SteamMsgBase.CMsgProtoBufHeader getDefaultInstanceForType() {
                return SteamMsgBase.CMsgProtoBufHeader.getDefaultInstance();
            }
            public SteamMsgBase.CMsgProtoBufHeader build() {
                SteamMsgBase.CMsgProtoBufHeader result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgBase.CMsgProtoBufHeader buildPartial() {
                SteamMsgBase.CMsgProtoBufHeader result = new SteamMsgBase.CMsgProtoBufHeader(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.steamid_ = steamid_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.clientSessionid_ = clientSessionid_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.routingAppid_ = routingAppid_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.jobidSource_ = jobidSource_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.jobidTarget_ = jobidTarget_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.targetJobName_ = targetJobName_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.seqNum_ = seqNum_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.eresult_ = eresult_;
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000100;
                }
                result.errorMessage_ = errorMessage_;
                if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
                    to_bitField0_ |= 0x00000200;
                }
                result.ip_ = ip_;
                if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
                    to_bitField0_ |= 0x00000400;
                }
                result.authAccountFlags_ = authAccountFlags_;
                if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
                    to_bitField0_ |= 0x00000800;
                }
                result.tokenSource_ = tokenSource_;
                if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
                    to_bitField0_ |= 0x00001000;
                }
                result.adminSpoofingUser_ = adminSpoofingUser_;
                if (((from_bitField0_ & 0x00002000) == 0x00002000)) {
                    to_bitField0_ |= 0x00002000;
                }
                result.transportError_ = transportError_;
                if (((from_bitField0_ & 0x00004000) == 0x00004000)) {
                    to_bitField0_ |= 0x00004000;
                }
                result.messageid_ = messageid_;
                if (((from_bitField0_ & 0x00008000) == 0x00008000)) {
                    to_bitField0_ |= 0x00008000;
                }
                result.publisherGroupId_ = publisherGroupId_;
                if (((from_bitField0_ & 0x00010000) == 0x00010000)) {
                    to_bitField0_ |= 0x00010000;
                }
                result.sysid_ = sysid_;
                if (((from_bitField0_ & 0x00020000) == 0x00020000)) {
                    to_bitField0_ |= 0x00020000;
                }
                result.traceTag_ = traceTag_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgBase.CMsgProtoBufHeader) {
                    return mergeFrom((SteamMsgBase.CMsgProtoBufHeader)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgBase.CMsgProtoBufHeader other) {
                if (other == SteamMsgBase.CMsgProtoBufHeader.getDefaultInstance()) return this;
                if (other.hasSteamid()) {
                    setSteamid(other.getSteamid());
                }
                if (other.hasClientSessionid()) {
                    setClientSessionid(other.getClientSessionid());
                }
                if (other.hasRoutingAppid()) {
                    setRoutingAppid(other.getRoutingAppid());
                }
                if (other.hasJobidSource()) {
                    setJobidSource(other.getJobidSource());
                }
                if (other.hasJobidTarget()) {
                    setJobidTarget(other.getJobidTarget());
                }
                if (other.hasTargetJobName()) {
                    bitField0_ |= 0x00000020;
                    targetJobName_ = other.targetJobName_;
                    onChanged();
                }
                if (other.hasSeqNum()) {
                    setSeqNum(other.getSeqNum());
                }
                if (other.hasEresult()) {
                    setEresult(other.getEresult());
                }
                if (other.hasErrorMessage()) {
                    bitField0_ |= 0x00000100;
                    errorMessage_ = other.errorMessage_;
                    onChanged();
                }
                if (other.hasIp()) {
                    setIp(other.getIp());
                }
                if (other.hasAuthAccountFlags()) {
                    setAuthAccountFlags(other.getAuthAccountFlags());
                }
                if (other.hasTokenSource()) {
                    setTokenSource(other.getTokenSource());
                }
                if (other.hasAdminSpoofingUser()) {
                    setAdminSpoofingUser(other.getAdminSpoofingUser());
                }
                if (other.hasTransportError()) {
                    setTransportError(other.getTransportError());
                }
                if (other.hasMessageid()) {
                    setMessageid(other.getMessageid());
                }
                if (other.hasPublisherGroupId()) {
                    setPublisherGroupId(other.getPublisherGroupId());
                }
                if (other.hasSysid()) {
                    setSysid(other.getSysid());
                }
                if (other.hasTraceTag()) {
                    setTraceTag(other.getTraceTag());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgBase.CMsgProtoBufHeader parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgBase.CMsgProtoBufHeader) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional fixed64 steamid = 1;
            private long steamid_ ;
            /**
             * <code>optional fixed64 steamid = 1;</code>
             */
            public boolean hasSteamid() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional fixed64 steamid = 1;</code>
             */
            public long getSteamid() {
                return steamid_;
            }
            /**
             * <code>optional fixed64 steamid = 1;</code>
             */
            public Builder setSteamid(long value) {
                bitField0_ |= 0x00000001;
                steamid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional fixed64 steamid = 1;</code>
             */
            public Builder clearSteamid() {
                bitField0_ = (bitField0_ & ~0x00000001);
                steamid_ = 0L;
                onChanged();
                return this;
            }
            // optional int32 client_sessionid = 2;
            private int clientSessionid_ ;
            /**
             * <code>optional int32 client_sessionid = 2;</code>
             */
            public boolean hasClientSessionid() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional int32 client_sessionid = 2;</code>
             */
            public int getClientSessionid() {
                return clientSessionid_;
            }
            /**
             * <code>optional int32 client_sessionid = 2;</code>
             */
            public Builder setClientSessionid(int value) {
                bitField0_ |= 0x00000002;
                clientSessionid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 client_sessionid = 2;</code>
             */
            public Builder clearClientSessionid() {
                bitField0_ = (bitField0_ & ~0x00000002);
                clientSessionid_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 routing_appid = 3;
            private int routingAppid_ ;
            /**
             * <code>optional uint32 routing_appid = 3;</code>
             */
            public boolean hasRoutingAppid() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint32 routing_appid = 3;</code>
             */
            public int getRoutingAppid() {
                return routingAppid_;
            }
            /**
             * <code>optional uint32 routing_appid = 3;</code>
             */
            public Builder setRoutingAppid(int value) {
                bitField0_ |= 0x00000004;
                routingAppid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 routing_appid = 3;</code>
             */
            public Builder clearRoutingAppid() {
                bitField0_ = (bitField0_ & ~0x00000004);
                routingAppid_ = 0;
                onChanged();
                return this;
            }
            // optional fixed64 jobid_source = 10 [default = 18446744073709551615];
            private long jobidSource_ = -1L;
            /**
             * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
             */
            public boolean hasJobidSource() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
             */
            public long getJobidSource() {
                return jobidSource_;
            }
            /**
             * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
             */
            public Builder setJobidSource(long value) {
                bitField0_ |= 0x00000008;
                jobidSource_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional fixed64 jobid_source = 10 [default = 18446744073709551615];</code>
             */
            public Builder clearJobidSource() {
                bitField0_ = (bitField0_ & ~0x00000008);
                jobidSource_ = -1L;
                onChanged();
                return this;
            }
            // optional fixed64 jobid_target = 11 [default = 18446744073709551615];
            private long jobidTarget_ = -1L;
            /**
             * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
             */
            public boolean hasJobidTarget() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
             */
            public long getJobidTarget() {
                return jobidTarget_;
            }
            /**
             * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
             */
            public Builder setJobidTarget(long value) {
                bitField0_ |= 0x00000010;
                jobidTarget_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional fixed64 jobid_target = 11 [default = 18446744073709551615];</code>
             */
            public Builder clearJobidTarget() {
                bitField0_ = (bitField0_ & ~0x00000010);
                jobidTarget_ = -1L;
                onChanged();
                return this;
            }
            // optional string target_job_name = 12;
            private java.lang.Object targetJobName_ = "";
            /**
             * <code>optional string target_job_name = 12;</code>
             */
            public boolean hasTargetJobName() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional string target_job_name = 12;</code>
             */
            public java.lang.String getTargetJobName() {
                java.lang.Object ref = targetJobName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    targetJobName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string target_job_name = 12;</code>
             */
            public com.google.protobuf.ByteString
            getTargetJobNameBytes() {
                java.lang.Object ref = targetJobName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    targetJobName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string target_job_name = 12;</code>
             */
            public Builder setTargetJobName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                targetJobName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string target_job_name = 12;</code>
             */
            public Builder clearTargetJobName() {
                bitField0_ = (bitField0_ & ~0x00000020);
                targetJobName_ = getDefaultInstance().getTargetJobName();
                onChanged();
                return this;
            }
            /**
             * <code>optional string target_job_name = 12;</code>
             */
            public Builder setTargetJobNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                targetJobName_ = value;
                onChanged();
                return this;
            }
            // optional int32 seq_num = 24;
            private int seqNum_ ;
            /**
             * <code>optional int32 seq_num = 24;</code>
             */
            public boolean hasSeqNum() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional int32 seq_num = 24;</code>
             */
            public int getSeqNum() {
                return seqNum_;
            }
            /**
             * <code>optional int32 seq_num = 24;</code>
             */
            public Builder setSeqNum(int value) {
                bitField0_ |= 0x00000040;
                seqNum_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 seq_num = 24;</code>
             */
            public Builder clearSeqNum() {
                bitField0_ = (bitField0_ & ~0x00000040);
                seqNum_ = 0;
                onChanged();
                return this;
            }
            // optional int32 eresult = 13 [default = 2];
            private int eresult_ = 2;
            /**
             * <code>optional int32 eresult = 13 [default = 2];</code>
             */
            public boolean hasEresult() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional int32 eresult = 13 [default = 2];</code>
             */
            public int getEresult() {
                return eresult_;
            }
            /**
             * <code>optional int32 eresult = 13 [default = 2];</code>
             */
            public Builder setEresult(int value) {
                bitField0_ |= 0x00000080;
                eresult_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 eresult = 13 [default = 2];</code>
             */
            public Builder clearEresult() {
                bitField0_ = (bitField0_ & ~0x00000080);
                eresult_ = 2;
                onChanged();
                return this;
            }
            // optional string error_message = 14;
            private java.lang.Object errorMessage_ = "";
            /**
             * <code>optional string error_message = 14;</code>
             */
            public boolean hasErrorMessage() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>optional string error_message = 14;</code>
             */
            public java.lang.String getErrorMessage() {
                java.lang.Object ref = errorMessage_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    errorMessage_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string error_message = 14;</code>
             */
            public com.google.protobuf.ByteString
            getErrorMessageBytes() {
                java.lang.Object ref = errorMessage_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    errorMessage_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string error_message = 14;</code>
             */
            public Builder setErrorMessage(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000100;
                errorMessage_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string error_message = 14;</code>
             */
            public Builder clearErrorMessage() {
                bitField0_ = (bitField0_ & ~0x00000100);
                errorMessage_ = getDefaultInstance().getErrorMessage();
                onChanged();
                return this;
            }
            /**
             * <code>optional string error_message = 14;</code>
             */
            public Builder setErrorMessageBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000100;
                errorMessage_ = value;
                onChanged();
                return this;
            }
            // optional uint32 ip = 15;
            private int ip_ ;
            /**
             * <code>optional uint32 ip = 15;</code>
             */
            public boolean hasIp() {
                return ((bitField0_ & 0x00000200) == 0x00000200);
            }
            /**
             * <code>optional uint32 ip = 15;</code>
             */
            public int getIp() {
                return ip_;
            }
            /**
             * <code>optional uint32 ip = 15;</code>
             */
            public Builder setIp(int value) {
                bitField0_ |= 0x00000200;
                ip_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 ip = 15;</code>
             */
            public Builder clearIp() {
                bitField0_ = (bitField0_ & ~0x00000200);
                ip_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 auth_account_flags = 16;
            private int authAccountFlags_ ;
            /**
             * <code>optional uint32 auth_account_flags = 16;</code>
             */
            public boolean hasAuthAccountFlags() {
                return ((bitField0_ & 0x00000400) == 0x00000400);
            }
            /**
             * <code>optional uint32 auth_account_flags = 16;</code>
             */
            public int getAuthAccountFlags() {
                return authAccountFlags_;
            }
            /**
             * <code>optional uint32 auth_account_flags = 16;</code>
             */
            public Builder setAuthAccountFlags(int value) {
                bitField0_ |= 0x00000400;
                authAccountFlags_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 auth_account_flags = 16;</code>
             */
            public Builder clearAuthAccountFlags() {
                bitField0_ = (bitField0_ & ~0x00000400);
                authAccountFlags_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 token_source = 22;
            private int tokenSource_ ;
            /**
             * <code>optional uint32 token_source = 22;</code>
             */
            public boolean hasTokenSource() {
                return ((bitField0_ & 0x00000800) == 0x00000800);
            }
            /**
             * <code>optional uint32 token_source = 22;</code>
             */
            public int getTokenSource() {
                return tokenSource_;
            }
            /**
             * <code>optional uint32 token_source = 22;</code>
             */
            public Builder setTokenSource(int value) {
                bitField0_ |= 0x00000800;
                tokenSource_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 token_source = 22;</code>
             */
            public Builder clearTokenSource() {
                bitField0_ = (bitField0_ & ~0x00000800);
                tokenSource_ = 0;
                onChanged();
                return this;
            }
            // optional bool admin_spoofing_user = 23;
            private boolean adminSpoofingUser_ ;
            /**
             * <code>optional bool admin_spoofing_user = 23;</code>
             */
            public boolean hasAdminSpoofingUser() {
                return ((bitField0_ & 0x00001000) == 0x00001000);
            }
            /**
             * <code>optional bool admin_spoofing_user = 23;</code>
             */
            public boolean getAdminSpoofingUser() {
                return adminSpoofingUser_;
            }
            /**
             * <code>optional bool admin_spoofing_user = 23;</code>
             */
            public Builder setAdminSpoofingUser(boolean value) {
                bitField0_ |= 0x00001000;
                adminSpoofingUser_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool admin_spoofing_user = 23;</code>
             */
            public Builder clearAdminSpoofingUser() {
                bitField0_ = (bitField0_ & ~0x00001000);
                adminSpoofingUser_ = false;
                onChanged();
                return this;
            }
            // optional int32 transport_error = 17 [default = 1];
            private int transportError_ = 1;
            /**
             * <code>optional int32 transport_error = 17 [default = 1];</code>
             */
            public boolean hasTransportError() {
                return ((bitField0_ & 0x00002000) == 0x00002000);
            }
            /**
             * <code>optional int32 transport_error = 17 [default = 1];</code>
             */
            public int getTransportError() {
                return transportError_;
            }
            /**
             * <code>optional int32 transport_error = 17 [default = 1];</code>
             */
            public Builder setTransportError(int value) {
                bitField0_ |= 0x00002000;
                transportError_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 transport_error = 17 [default = 1];</code>
             */
            public Builder clearTransportError() {
                bitField0_ = (bitField0_ & ~0x00002000);
                transportError_ = 1;
                onChanged();
                return this;
            }
            // optional uint64 messageid = 18 [default = 18446744073709551615];
            private long messageid_ = -1L;
            /**
             * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
             */
            public boolean hasMessageid() {
                return ((bitField0_ & 0x00004000) == 0x00004000);
            }
            /**
             * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
             */
            public long getMessageid() {
                return messageid_;
            }
            /**
             * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
             */
            public Builder setMessageid(long value) {
                bitField0_ |= 0x00004000;
                messageid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 messageid = 18 [default = 18446744073709551615];</code>
             */
            public Builder clearMessageid() {
                bitField0_ = (bitField0_ & ~0x00004000);
                messageid_ = -1L;
                onChanged();
                return this;
            }
            // optional uint32 publisher_group_id = 19;
            private int publisherGroupId_ ;
            /**
             * <code>optional uint32 publisher_group_id = 19;</code>
             */
            public boolean hasPublisherGroupId() {
                return ((bitField0_ & 0x00008000) == 0x00008000);
            }
            /**
             * <code>optional uint32 publisher_group_id = 19;</code>
             */
            public int getPublisherGroupId() {
                return publisherGroupId_;
            }
            /**
             * <code>optional uint32 publisher_group_id = 19;</code>
             */
            public Builder setPublisherGroupId(int value) {
                bitField0_ |= 0x00008000;
                publisherGroupId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 publisher_group_id = 19;</code>
             */
            public Builder clearPublisherGroupId() {
                bitField0_ = (bitField0_ & ~0x00008000);
                publisherGroupId_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 sysid = 20;
            private int sysid_ ;
            /**
             * <code>optional uint32 sysid = 20;</code>
             */
            public boolean hasSysid() {
                return ((bitField0_ & 0x00010000) == 0x00010000);
            }
            /**
             * <code>optional uint32 sysid = 20;</code>
             */
            public int getSysid() {
                return sysid_;
            }
            /**
             * <code>optional uint32 sysid = 20;</code>
             */
            public Builder setSysid(int value) {
                bitField0_ |= 0x00010000;
                sysid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 sysid = 20;</code>
             */
            public Builder clearSysid() {
                bitField0_ = (bitField0_ & ~0x00010000);
                sysid_ = 0;
                onChanged();
                return this;
            }
            // optional uint64 trace_tag = 21;
            private long traceTag_ ;
            /**
             * <code>optional uint64 trace_tag = 21;</code>
             */
            public boolean hasTraceTag() {
                return ((bitField0_ & 0x00020000) == 0x00020000);
            }
            /**
             * <code>optional uint64 trace_tag = 21;</code>
             */
            public long getTraceTag() {
                return traceTag_;
            }
            /**
             * <code>optional uint64 trace_tag = 21;</code>
             */
            public Builder setTraceTag(long value) {
                bitField0_ |= 0x00020000;
                traceTag_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 trace_tag = 21;</code>
             */
            public Builder clearTraceTag() {
                bitField0_ = (bitField0_ & ~0x00020000);
                traceTag_ = 0L;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgProtoBufHeader)
        }
        static {
            defaultInstance = new CMsgProtoBufHeader(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgProtoBufHeader)
    }
    public interface CMsgMultiOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint32 size_unzipped = 1;
        /**
         * <code>optional uint32 size_unzipped = 1;</code>
         */
        boolean hasSizeUnzipped();
        /**
         * <code>optional uint32 size_unzipped = 1;</code>
         */
        int getSizeUnzipped();
// optional bytes message_body = 2;
        /**
         * <code>optional bytes message_body = 2;</code>
         */
        boolean hasMessageBody();
        /**
         * <code>optional bytes message_body = 2;</code>
         */
        com.google.protobuf.ByteString getMessageBody();
    }
    /**
     * Protobuf type {@code CMsgMulti}
     */
    public static final class CMsgMulti extends
            com.google.protobuf.GeneratedMessage
            implements CMsgMultiOrBuilder {
        // Use CMsgMulti.newBuilder() to construct.
        private CMsgMulti(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgMulti(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgMulti defaultInstance;
        public static CMsgMulti getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgMulti getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgMulti(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            sizeUnzipped_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            messageBody_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgBase.internal_static_CMsgMulti_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgBase.internal_static_CMsgMulti_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgBase.CMsgMulti.class, SteamMsgBase.CMsgMulti.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgMulti> PARSER =
                new com.google.protobuf.AbstractParser<CMsgMulti>() {
                    public CMsgMulti parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgMulti(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgMulti> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint32 size_unzipped = 1;
        public static final int SIZE_UNZIPPED_FIELD_NUMBER = 1;
        private int sizeUnzipped_;
        /**
         * <code>optional uint32 size_unzipped = 1;</code>
         */
        public boolean hasSizeUnzipped() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 size_unzipped = 1;</code>
         */
        public int getSizeUnzipped() {
            return sizeUnzipped_;
        }
        // optional bytes message_body = 2;
        public static final int MESSAGE_BODY_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString messageBody_;
        /**
         * <code>optional bytes message_body = 2;</code>
         */
        public boolean hasMessageBody() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bytes message_body = 2;</code>
         */
        public com.google.protobuf.ByteString getMessageBody() {
            return messageBody_;
        }
        private void initFields() {
            sizeUnzipped_ = 0;
            messageBody_ = com.google.protobuf.ByteString.EMPTY;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, sizeUnzipped_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, messageBody_);
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, sizeUnzipped_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, messageBody_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }
        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }
        public static SteamMsgBase.CMsgMulti parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgMulti parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgBase.CMsgMulti parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgMulti parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgBase.CMsgMulti prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }
        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CMsgMulti}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgBase.CMsgMultiOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgBase.internal_static_CMsgMulti_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgBase.internal_static_CMsgMulti_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgBase.CMsgMulti.class, SteamMsgBase.CMsgMulti.Builder.class);
            }
            // Construct using SteamMsgBase.CMsgMulti.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }
            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                sizeUnzipped_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                messageBody_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgBase.internal_static_CMsgMulti_descriptor;
            }
            public SteamMsgBase.CMsgMulti getDefaultInstanceForType() {
                return SteamMsgBase.CMsgMulti.getDefaultInstance();
            }
            public SteamMsgBase.CMsgMulti build() {
                SteamMsgBase.CMsgMulti result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgBase.CMsgMulti buildPartial() {
                SteamMsgBase.CMsgMulti result = new SteamMsgBase.CMsgMulti(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.sizeUnzipped_ = sizeUnzipped_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.messageBody_ = messageBody_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgBase.CMsgMulti) {
                    return mergeFrom((SteamMsgBase.CMsgMulti)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgBase.CMsgMulti other) {
                if (other == SteamMsgBase.CMsgMulti.getDefaultInstance()) return this;
                if (other.hasSizeUnzipped()) {
                    setSizeUnzipped(other.getSizeUnzipped());
                }
                if (other.hasMessageBody()) {
                    setMessageBody(other.getMessageBody());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgBase.CMsgMulti parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgBase.CMsgMulti) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint32 size_unzipped = 1;
            private int sizeUnzipped_ ;
            /**
             * <code>optional uint32 size_unzipped = 1;</code>
             */
            public boolean hasSizeUnzipped() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 size_unzipped = 1;</code>
             */
            public int getSizeUnzipped() {
                return sizeUnzipped_;
            }
            /**
             * <code>optional uint32 size_unzipped = 1;</code>
             */
            public Builder setSizeUnzipped(int value) {
                bitField0_ |= 0x00000001;
                sizeUnzipped_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 size_unzipped = 1;</code>
             */
            public Builder clearSizeUnzipped() {
                bitField0_ = (bitField0_ & ~0x00000001);
                sizeUnzipped_ = 0;
                onChanged();
                return this;
            }
            // optional bytes message_body = 2;
            private com.google.protobuf.ByteString messageBody_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes message_body = 2;</code>
             */
            public boolean hasMessageBody() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bytes message_body = 2;</code>
             */
            public com.google.protobuf.ByteString getMessageBody() {
                return messageBody_;
            }
            /**
             * <code>optional bytes message_body = 2;</code>
             */
            public Builder setMessageBody(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                messageBody_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes message_body = 2;</code>
             */
            public Builder clearMessageBody() {
                bitField0_ = (bitField0_ & ~0x00000002);
                messageBody_ = getDefaultInstance().getMessageBody();
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgMulti)
        }
        static {
            defaultInstance = new CMsgMulti(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgMulti)
    }
    public interface CMsgProtobufWrappedOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional bytes message_body = 1;
        /**
         * <code>optional bytes message_body = 1;</code>
         */
        boolean hasMessageBody();
        /**
         * <code>optional bytes message_body = 1;</code>
         */
        com.google.protobuf.ByteString getMessageBody();
    }
    /**
     * Protobuf type {@code CMsgProtobufWrapped}
     */
    public static final class CMsgProtobufWrapped extends
            com.google.protobuf.GeneratedMessage
            implements CMsgProtobufWrappedOrBuilder {
        // Use CMsgProtobufWrapped.newBuilder() to construct.
        private CMsgProtobufWrapped(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgProtobufWrapped(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgProtobufWrapped defaultInstance;
        public static CMsgProtobufWrapped getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgProtobufWrapped getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgProtobufWrapped(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            messageBody_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgBase.internal_static_CMsgProtobufWrapped_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgBase.internal_static_CMsgProtobufWrapped_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgBase.CMsgProtobufWrapped.class, SteamMsgBase.CMsgProtobufWrapped.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgProtobufWrapped> PARSER =
                new com.google.protobuf.AbstractParser<CMsgProtobufWrapped>() {
                    public CMsgProtobufWrapped parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgProtobufWrapped(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgProtobufWrapped> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional bytes message_body = 1;
        public static final int MESSAGE_BODY_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString messageBody_;
        /**
         * <code>optional bytes message_body = 1;</code>
         */
        public boolean hasMessageBody() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional bytes message_body = 1;</code>
         */
        public com.google.protobuf.ByteString getMessageBody() {
            return messageBody_;
        }
        private void initFields() {
            messageBody_ = com.google.protobuf.ByteString.EMPTY;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, messageBody_);
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, messageBody_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }
        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgProtobufWrapped parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgBase.CMsgProtobufWrapped prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }
        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CMsgProtobufWrapped}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgBase.CMsgProtobufWrappedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgBase.internal_static_CMsgProtobufWrapped_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgBase.internal_static_CMsgProtobufWrapped_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgBase.CMsgProtobufWrapped.class, SteamMsgBase.CMsgProtobufWrapped.Builder.class);
            }
            // Construct using SteamMsgBase.CMsgProtobufWrapped.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }
            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                messageBody_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgBase.internal_static_CMsgProtobufWrapped_descriptor;
            }
            public SteamMsgBase.CMsgProtobufWrapped getDefaultInstanceForType() {
                return SteamMsgBase.CMsgProtobufWrapped.getDefaultInstance();
            }
            public SteamMsgBase.CMsgProtobufWrapped build() {
                SteamMsgBase.CMsgProtobufWrapped result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgBase.CMsgProtobufWrapped buildPartial() {
                SteamMsgBase.CMsgProtobufWrapped result = new SteamMsgBase.CMsgProtobufWrapped(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.messageBody_ = messageBody_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgBase.CMsgProtobufWrapped) {
                    return mergeFrom((SteamMsgBase.CMsgProtobufWrapped)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgBase.CMsgProtobufWrapped other) {
                if (other == SteamMsgBase.CMsgProtobufWrapped.getDefaultInstance()) return this;
                if (other.hasMessageBody()) {
                    setMessageBody(other.getMessageBody());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgBase.CMsgProtobufWrapped parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgBase.CMsgProtobufWrapped) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional bytes message_body = 1;
            private com.google.protobuf.ByteString messageBody_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes message_body = 1;</code>
             */
            public boolean hasMessageBody() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional bytes message_body = 1;</code>
             */
            public com.google.protobuf.ByteString getMessageBody() {
                return messageBody_;
            }
            /**
             * <code>optional bytes message_body = 1;</code>
             */
            public Builder setMessageBody(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                messageBody_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes message_body = 1;</code>
             */
            public Builder clearMessageBody() {
                bitField0_ = (bitField0_ & ~0x00000001);
                messageBody_ = getDefaultInstance().getMessageBody();
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgProtobufWrapped)
        }
        static {
            defaultInstance = new CMsgProtobufWrapped(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgProtobufWrapped)
    }
    public interface CMsgAuthTicketOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint32 estate = 1;
        /**
         * <code>optional uint32 estate = 1;</code>
         */
        boolean hasEstate();
        /**
         * <code>optional uint32 estate = 1;</code>
         */
        int getEstate();
// optional uint32 eresult = 2 [default = 2];
        /**
         * <code>optional uint32 eresult = 2 [default = 2];</code>
         */
        boolean hasEresult();
        /**
         * <code>optional uint32 eresult = 2 [default = 2];</code>
         */
        int getEresult();
// optional fixed64 steamid = 3;
        /**
         * <code>optional fixed64 steamid = 3;</code>
         */
        boolean hasSteamid();
        /**
         * <code>optional fixed64 steamid = 3;</code>
         */
        long getSteamid();
// optional fixed64 gameid = 4;
        /**
         * <code>optional fixed64 gameid = 4;</code>
         */
        boolean hasGameid();
        /**
         * <code>optional fixed64 gameid = 4;</code>
         */
        long getGameid();
// optional uint32 h_steam_pipe = 5;
        /**
         * <code>optional uint32 h_steam_pipe = 5;</code>
         */
        boolean hasHSteamPipe();
        /**
         * <code>optional uint32 h_steam_pipe = 5;</code>
         */
        int getHSteamPipe();
// optional uint32 ticket_crc = 6;
        /**
         * <code>optional uint32 ticket_crc = 6;</code>
         */
        boolean hasTicketCrc();
        /**
         * <code>optional uint32 ticket_crc = 6;</code>
         */
        int getTicketCrc();
// optional bytes ticket = 7;
        /**
         * <code>optional bytes ticket = 7;</code>
         */
        boolean hasTicket();
        /**
         * <code>optional bytes ticket = 7;</code>
         */
        com.google.protobuf.ByteString getTicket();
    }
    /**
     * Protobuf type {@code CMsgAuthTicket}
     */
    public static final class CMsgAuthTicket extends
            com.google.protobuf.GeneratedMessage
            implements CMsgAuthTicketOrBuilder {
        // Use CMsgAuthTicket.newBuilder() to construct.
        private CMsgAuthTicket(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgAuthTicket(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgAuthTicket defaultInstance;
        public static CMsgAuthTicket getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgAuthTicket getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgAuthTicket(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            estate_ = input.readUInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            eresult_ = input.readUInt32();
                            break;
                        }
                        case 25: {
                            bitField0_ |= 0x00000004;
                            steamid_ = input.readFixed64();
                            break;
                        }
                        case 33: {
                            bitField0_ |= 0x00000008;
                            gameid_ = input.readFixed64();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            hSteamPipe_ = input.readUInt32();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            ticketCrc_ = input.readUInt32();
                            break;
                        }
                        case 58: {
                            bitField0_ |= 0x00000040;
                            ticket_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgBase.internal_static_CMsgAuthTicket_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgBase.internal_static_CMsgAuthTicket_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgBase.CMsgAuthTicket.class, SteamMsgBase.CMsgAuthTicket.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgAuthTicket> PARSER =
                new com.google.protobuf.AbstractParser<CMsgAuthTicket>() {
                    public CMsgAuthTicket parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgAuthTicket(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgAuthTicket> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint32 estate = 1;
        public static final int ESTATE_FIELD_NUMBER = 1;
        private int estate_;
        /**
         * <code>optional uint32 estate = 1;</code>
         */
        public boolean hasEstate() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 estate = 1;</code>
         */
        public int getEstate() {
            return estate_;
        }
        // optional uint32 eresult = 2 [default = 2];
        public static final int ERESULT_FIELD_NUMBER = 2;
        private int eresult_;
        /**
         * <code>optional uint32 eresult = 2 [default = 2];</code>
         */
        public boolean hasEresult() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 eresult = 2 [default = 2];</code>
         */
        public int getEresult() {
            return eresult_;
        }
        // optional fixed64 steamid = 3;
        public static final int STEAMID_FIELD_NUMBER = 3;
        private long steamid_;
        /**
         * <code>optional fixed64 steamid = 3;</code>
         */
        public boolean hasSteamid() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional fixed64 steamid = 3;</code>
         */
        public long getSteamid() {
            return steamid_;
        }
        // optional fixed64 gameid = 4;
        public static final int GAMEID_FIELD_NUMBER = 4;
        private long gameid_;
        /**
         * <code>optional fixed64 gameid = 4;</code>
         */
        public boolean hasGameid() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional fixed64 gameid = 4;</code>
         */
        public long getGameid() {
            return gameid_;
        }
        // optional uint32 h_steam_pipe = 5;
        public static final int H_STEAM_PIPE_FIELD_NUMBER = 5;
        private int hSteamPipe_;
        /**
         * <code>optional uint32 h_steam_pipe = 5;</code>
         */
        public boolean hasHSteamPipe() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint32 h_steam_pipe = 5;</code>
         */
        public int getHSteamPipe() {
            return hSteamPipe_;
        }
        // optional uint32 ticket_crc = 6;
        public static final int TICKET_CRC_FIELD_NUMBER = 6;
        private int ticketCrc_;
        /**
         * <code>optional uint32 ticket_crc = 6;</code>
         */
        public boolean hasTicketCrc() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional uint32 ticket_crc = 6;</code>
         */
        public int getTicketCrc() {
            return ticketCrc_;
        }
        // optional bytes ticket = 7;
        public static final int TICKET_FIELD_NUMBER = 7;
        private com.google.protobuf.ByteString ticket_;
        /**
         * <code>optional bytes ticket = 7;</code>
         */
        public boolean hasTicket() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional bytes ticket = 7;</code>
         */
        public com.google.protobuf.ByteString getTicket() {
            return ticket_;
        }
        private void initFields() {
            estate_ = 0;
            eresult_ = 2;
            steamid_ = 0L;
            gameid_ = 0L;
            hSteamPipe_ = 0;
            ticketCrc_ = 0;
            ticket_ = com.google.protobuf.ByteString.EMPTY;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, estate_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(2, eresult_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeFixed64(3, steamid_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeFixed64(4, gameid_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeUInt32(5, hSteamPipe_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeUInt32(6, ticketCrc_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeBytes(7, ticket_);
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, estate_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, eresult_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFixed64Size(3, steamid_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFixed64Size(4, gameid_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(5, hSteamPipe_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(6, ticketCrc_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(7, ticket_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }
        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAuthTicket parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgBase.CMsgAuthTicket parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgAuthTicket parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgBase.CMsgAuthTicket prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }
        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CMsgAuthTicket}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgBase.CMsgAuthTicketOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgBase.internal_static_CMsgAuthTicket_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgBase.internal_static_CMsgAuthTicket_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgBase.CMsgAuthTicket.class, SteamMsgBase.CMsgAuthTicket.Builder.class);
            }
            // Construct using SteamMsgBase.CMsgAuthTicket.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }
            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                estate_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                eresult_ = 2;
                bitField0_ = (bitField0_ & ~0x00000002);
                steamid_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000004);
                gameid_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                hSteamPipe_ = 0;
                bitField0_ = (bitField0_ & ~0x00000010);
                ticketCrc_ = 0;
                bitField0_ = (bitField0_ & ~0x00000020);
                ticket_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000040);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgBase.internal_static_CMsgAuthTicket_descriptor;
            }
            public SteamMsgBase.CMsgAuthTicket getDefaultInstanceForType() {
                return SteamMsgBase.CMsgAuthTicket.getDefaultInstance();
            }
            public SteamMsgBase.CMsgAuthTicket build() {
                SteamMsgBase.CMsgAuthTicket result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgBase.CMsgAuthTicket buildPartial() {
                SteamMsgBase.CMsgAuthTicket result = new SteamMsgBase.CMsgAuthTicket(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.estate_ = estate_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.eresult_ = eresult_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.steamid_ = steamid_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.gameid_ = gameid_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.hSteamPipe_ = hSteamPipe_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.ticketCrc_ = ticketCrc_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.ticket_ = ticket_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgBase.CMsgAuthTicket) {
                    return mergeFrom((SteamMsgBase.CMsgAuthTicket)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgBase.CMsgAuthTicket other) {
                if (other == SteamMsgBase.CMsgAuthTicket.getDefaultInstance()) return this;
                if (other.hasEstate()) {
                    setEstate(other.getEstate());
                }
                if (other.hasEresult()) {
                    setEresult(other.getEresult());
                }
                if (other.hasSteamid()) {
                    setSteamid(other.getSteamid());
                }
                if (other.hasGameid()) {
                    setGameid(other.getGameid());
                }
                if (other.hasHSteamPipe()) {
                    setHSteamPipe(other.getHSteamPipe());
                }
                if (other.hasTicketCrc()) {
                    setTicketCrc(other.getTicketCrc());
                }
                if (other.hasTicket()) {
                    setTicket(other.getTicket());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgBase.CMsgAuthTicket parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgBase.CMsgAuthTicket) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint32 estate = 1;
            private int estate_ ;
            /**
             * <code>optional uint32 estate = 1;</code>
             */
            public boolean hasEstate() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 estate = 1;</code>
             */
            public int getEstate() {
                return estate_;
            }
            /**
             * <code>optional uint32 estate = 1;</code>
             */
            public Builder setEstate(int value) {
                bitField0_ |= 0x00000001;
                estate_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 estate = 1;</code>
             */
            public Builder clearEstate() {
                bitField0_ = (bitField0_ & ~0x00000001);
                estate_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 eresult = 2 [default = 2];
            private int eresult_ = 2;
            /**
             * <code>optional uint32 eresult = 2 [default = 2];</code>
             */
            public boolean hasEresult() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint32 eresult = 2 [default = 2];</code>
             */
            public int getEresult() {
                return eresult_;
            }
            /**
             * <code>optional uint32 eresult = 2 [default = 2];</code>
             */
            public Builder setEresult(int value) {
                bitField0_ |= 0x00000002;
                eresult_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 eresult = 2 [default = 2];</code>
             */
            public Builder clearEresult() {
                bitField0_ = (bitField0_ & ~0x00000002);
                eresult_ = 2;
                onChanged();
                return this;
            }
            // optional fixed64 steamid = 3;
            private long steamid_ ;
            /**
             * <code>optional fixed64 steamid = 3;</code>
             */
            public boolean hasSteamid() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional fixed64 steamid = 3;</code>
             */
            public long getSteamid() {
                return steamid_;
            }
            /**
             * <code>optional fixed64 steamid = 3;</code>
             */
            public Builder setSteamid(long value) {
                bitField0_ |= 0x00000004;
                steamid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional fixed64 steamid = 3;</code>
             */
            public Builder clearSteamid() {
                bitField0_ = (bitField0_ & ~0x00000004);
                steamid_ = 0L;
                onChanged();
                return this;
            }
            // optional fixed64 gameid = 4;
            private long gameid_ ;
            /**
             * <code>optional fixed64 gameid = 4;</code>
             */
            public boolean hasGameid() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional fixed64 gameid = 4;</code>
             */
            public long getGameid() {
                return gameid_;
            }
            /**
             * <code>optional fixed64 gameid = 4;</code>
             */
            public Builder setGameid(long value) {
                bitField0_ |= 0x00000008;
                gameid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional fixed64 gameid = 4;</code>
             */
            public Builder clearGameid() {
                bitField0_ = (bitField0_ & ~0x00000008);
                gameid_ = 0L;
                onChanged();
                return this;
            }
            // optional uint32 h_steam_pipe = 5;
            private int hSteamPipe_ ;
            /**
             * <code>optional uint32 h_steam_pipe = 5;</code>
             */
            public boolean hasHSteamPipe() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional uint32 h_steam_pipe = 5;</code>
             */
            public int getHSteamPipe() {
                return hSteamPipe_;
            }
            /**
             * <code>optional uint32 h_steam_pipe = 5;</code>
             */
            public Builder setHSteamPipe(int value) {
                bitField0_ |= 0x00000010;
                hSteamPipe_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 h_steam_pipe = 5;</code>
             */
            public Builder clearHSteamPipe() {
                bitField0_ = (bitField0_ & ~0x00000010);
                hSteamPipe_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 ticket_crc = 6;
            private int ticketCrc_ ;
            /**
             * <code>optional uint32 ticket_crc = 6;</code>
             */
            public boolean hasTicketCrc() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional uint32 ticket_crc = 6;</code>
             */
            public int getTicketCrc() {
                return ticketCrc_;
            }
            /**
             * <code>optional uint32 ticket_crc = 6;</code>
             */
            public Builder setTicketCrc(int value) {
                bitField0_ |= 0x00000020;
                ticketCrc_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 ticket_crc = 6;</code>
             */
            public Builder clearTicketCrc() {
                bitField0_ = (bitField0_ & ~0x00000020);
                ticketCrc_ = 0;
                onChanged();
                return this;
            }
            // optional bytes ticket = 7;
            private com.google.protobuf.ByteString ticket_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes ticket = 7;</code>
             */
            public boolean hasTicket() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional bytes ticket = 7;</code>
             */
            public com.google.protobuf.ByteString getTicket() {
                return ticket_;
            }
            /**
             * <code>optional bytes ticket = 7;</code>
             */
            public Builder setTicket(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000040;
                ticket_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes ticket = 7;</code>
             */
            public Builder clearTicket() {
                bitField0_ = (bitField0_ & ~0x00000040);
                ticket_ = getDefaultInstance().getTicket();
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgAuthTicket)
        }
        static {
            defaultInstance = new CMsgAuthTicket(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgAuthTicket)
    }
    public interface CCDDBAppDetailCommonOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint32 appid = 1;
        /**
         * <code>optional uint32 appid = 1;</code>
         */
        boolean hasAppid();
        /**
         * <code>optional uint32 appid = 1;</code>
         */
        int getAppid();
// optional string name = 2;
        /**
         * <code>optional string name = 2;</code>
         */
        boolean hasName();
        /**
         * <code>optional string name = 2;</code>
         */
        java.lang.String getName();
        /**
         * <code>optional string name = 2;</code>
         */
        com.google.protobuf.ByteString
        getNameBytes();
// optional string icon = 3;
        /**
         * <code>optional string icon = 3;</code>
         */
        boolean hasIcon();
        /**
         * <code>optional string icon = 3;</code>
         */
        java.lang.String getIcon();
        /**
         * <code>optional string icon = 3;</code>
         */
        com.google.protobuf.ByteString
        getIconBytes();
// optional string logo = 4;
        /**
         * <code>optional string logo = 4;</code>
         */
        boolean hasLogo();
        /**
         * <code>optional string logo = 4;</code>
         */
        java.lang.String getLogo();
        /**
         * <code>optional string logo = 4;</code>
         */
        com.google.protobuf.ByteString
        getLogoBytes();
// optional string logo_small = 5;
        /**
         * <code>optional string logo_small = 5;</code>
         */
        boolean hasLogoSmall();
        /**
         * <code>optional string logo_small = 5;</code>
         */
        java.lang.String getLogoSmall();
        /**
         * <code>optional string logo_small = 5;</code>
         */
        com.google.protobuf.ByteString
        getLogoSmallBytes();
// optional bool tool = 6;
        /**
         * <code>optional bool tool = 6;</code>
         */
        boolean hasTool();
        /**
         * <code>optional bool tool = 6;</code>
         */
        boolean getTool();
// optional bool demo = 7;
        /**
         * <code>optional bool demo = 7;</code>
         */
        boolean hasDemo();
        /**
         * <code>optional bool demo = 7;</code>
         */
        boolean getDemo();
// optional bool media = 8;
        /**
         * <code>optional bool media = 8;</code>
         */
        boolean hasMedia();
        /**
         * <code>optional bool media = 8;</code>
         */
        boolean getMedia();
// optional bool community_visible_stats = 9;
        /**
         * <code>optional bool community_visible_stats = 9;</code>
         */
        boolean hasCommunityVisibleStats();
        /**
         * <code>optional bool community_visible_stats = 9;</code>
         */
        boolean getCommunityVisibleStats();
// optional string friendly_name = 10;
        /**
         * <code>optional string friendly_name = 10;</code>
         */
        boolean hasFriendlyName();
        /**
         * <code>optional string friendly_name = 10;</code>
         */
        java.lang.String getFriendlyName();
        /**
         * <code>optional string friendly_name = 10;</code>
         */
        com.google.protobuf.ByteString
        getFriendlyNameBytes();
// optional string propagation = 11;
        /**
         * <code>optional string propagation = 11;</code>
         */
        boolean hasPropagation();
        /**
         * <code>optional string propagation = 11;</code>
         */
        java.lang.String getPropagation();
        /**
         * <code>optional string propagation = 11;</code>
         */
        com.google.protobuf.ByteString
        getPropagationBytes();
// optional bool has_adult_content = 12;
        /**
         * <code>optional bool has_adult_content = 12;</code>
         */
        boolean hasHasAdultContent();
        /**
         * <code>optional bool has_adult_content = 12;</code>
         */
        boolean getHasAdultContent();
    }
    /**
     * Protobuf type {@code CCDDBAppDetailCommon}
     */
    public static final class CCDDBAppDetailCommon extends
            com.google.protobuf.GeneratedMessage
            implements CCDDBAppDetailCommonOrBuilder {
        // Use CCDDBAppDetailCommon.newBuilder() to construct.
        private CCDDBAppDetailCommon(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CCDDBAppDetailCommon(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CCDDBAppDetailCommon defaultInstance;
        public static CCDDBAppDetailCommon getDefaultInstance() {
            return defaultInstance;
        }
        public CCDDBAppDetailCommon getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CCDDBAppDetailCommon(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            appid_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            name_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            icon_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            logo_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            logoSmall_ = input.readBytes();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            tool_ = input.readBool();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            demo_ = input.readBool();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000080;
                            media_ = input.readBool();
                            break;
                        }
                        case 72: {
                            bitField0_ |= 0x00000100;
                            communityVisibleStats_ = input.readBool();
                            break;
                        }
                        case 82: {
                            bitField0_ |= 0x00000200;
                            friendlyName_ = input.readBytes();
                            break;
                        }
                        case 90: {
                            bitField0_ |= 0x00000400;
                            propagation_ = input.readBytes();
                            break;
                        }
                        case 96: {
                            bitField0_ |= 0x00000800;
                            hasAdultContent_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgBase.internal_static_CCDDBAppDetailCommon_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgBase.internal_static_CCDDBAppDetailCommon_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgBase.CCDDBAppDetailCommon.class, SteamMsgBase.CCDDBAppDetailCommon.Builder.class);
        }
        public static com.google.protobuf.Parser<CCDDBAppDetailCommon> PARSER =
                new com.google.protobuf.AbstractParser<CCDDBAppDetailCommon>() {
                    public CCDDBAppDetailCommon parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CCDDBAppDetailCommon(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CCDDBAppDetailCommon> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint32 appid = 1;
        public static final int APPID_FIELD_NUMBER = 1;
        private int appid_;
        /**
         * <code>optional uint32 appid = 1;</code>
         */
        public boolean hasAppid() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 appid = 1;</code>
         */
        public int getAppid() {
            return appid_;
        }
        // optional string name = 2;
        public static final int NAME_FIELD_NUMBER = 2;
        private java.lang.Object name_;
        /**
         * <code>optional string name = 2;</code>
         */
        public boolean hasName() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string name = 2;</code>
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    name_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string name = 2;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional string icon = 3;
        public static final int ICON_FIELD_NUMBER = 3;
        private java.lang.Object icon_;
        /**
         * <code>optional string icon = 3;</code>
         */
        public boolean hasIcon() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional string icon = 3;</code>
         */
        public java.lang.String getIcon() {
            java.lang.Object ref = icon_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    icon_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string icon = 3;</code>
         */
        public com.google.protobuf.ByteString
        getIconBytes() {
            java.lang.Object ref = icon_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                icon_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional string logo = 4;
        public static final int LOGO_FIELD_NUMBER = 4;
        private java.lang.Object logo_;
        /**
         * <code>optional string logo = 4;</code>
         */
        public boolean hasLogo() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string logo = 4;</code>
         */
        public java.lang.String getLogo() {
            java.lang.Object ref = logo_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    logo_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string logo = 4;</code>
         */
        public com.google.protobuf.ByteString
        getLogoBytes() {
            java.lang.Object ref = logo_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                logo_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional string logo_small = 5;
        public static final int LOGO_SMALL_FIELD_NUMBER = 5;
        private java.lang.Object logoSmall_;
        /**
         * <code>optional string logo_small = 5;</code>
         */
        public boolean hasLogoSmall() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional string logo_small = 5;</code>
         */
        public java.lang.String getLogoSmall() {
            java.lang.Object ref = logoSmall_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    logoSmall_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string logo_small = 5;</code>
         */
        public com.google.protobuf.ByteString
        getLogoSmallBytes() {
            java.lang.Object ref = logoSmall_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                logoSmall_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional bool tool = 6;
        public static final int TOOL_FIELD_NUMBER = 6;
        private boolean tool_;
        /**
         * <code>optional bool tool = 6;</code>
         */
        public boolean hasTool() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional bool tool = 6;</code>
         */
        public boolean getTool() {
            return tool_;
        }
        // optional bool demo = 7;
        public static final int DEMO_FIELD_NUMBER = 7;
        private boolean demo_;
        /**
         * <code>optional bool demo = 7;</code>
         */
        public boolean hasDemo() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional bool demo = 7;</code>
         */
        public boolean getDemo() {
            return demo_;
        }
        // optional bool media = 8;
        public static final int MEDIA_FIELD_NUMBER = 8;
        private boolean media_;
        /**
         * <code>optional bool media = 8;</code>
         */
        public boolean hasMedia() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional bool media = 8;</code>
         */
        public boolean getMedia() {
            return media_;
        }
        // optional bool community_visible_stats = 9;
        public static final int COMMUNITY_VISIBLE_STATS_FIELD_NUMBER = 9;
        private boolean communityVisibleStats_;
        /**
         * <code>optional bool community_visible_stats = 9;</code>
         */
        public boolean hasCommunityVisibleStats() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>optional bool community_visible_stats = 9;</code>
         */
        public boolean getCommunityVisibleStats() {
            return communityVisibleStats_;
        }
        // optional string friendly_name = 10;
        public static final int FRIENDLY_NAME_FIELD_NUMBER = 10;
        private java.lang.Object friendlyName_;
        /**
         * <code>optional string friendly_name = 10;</code>
         */
        public boolean hasFriendlyName() {
            return ((bitField0_ & 0x00000200) == 0x00000200);
        }
        /**
         * <code>optional string friendly_name = 10;</code>
         */
        public java.lang.String getFriendlyName() {
            java.lang.Object ref = friendlyName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    friendlyName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string friendly_name = 10;</code>
         */
        public com.google.protobuf.ByteString
        getFriendlyNameBytes() {
            java.lang.Object ref = friendlyName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                friendlyName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional string propagation = 11;
        public static final int PROPAGATION_FIELD_NUMBER = 11;
        private java.lang.Object propagation_;
        /**
         * <code>optional string propagation = 11;</code>
         */
        public boolean hasPropagation() {
            return ((bitField0_ & 0x00000400) == 0x00000400);
        }
        /**
         * <code>optional string propagation = 11;</code>
         */
        public java.lang.String getPropagation() {
            java.lang.Object ref = propagation_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    propagation_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string propagation = 11;</code>
         */
        public com.google.protobuf.ByteString
        getPropagationBytes() {
            java.lang.Object ref = propagation_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                propagation_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional bool has_adult_content = 12;
        public static final int HAS_ADULT_CONTENT_FIELD_NUMBER = 12;
        private boolean hasAdultContent_;
        /**
         * <code>optional bool has_adult_content = 12;</code>
         */
        public boolean hasHasAdultContent() {
            return ((bitField0_ & 0x00000800) == 0x00000800);
        }
        /**
         * <code>optional bool has_adult_content = 12;</code>
         */
        public boolean getHasAdultContent() {
            return hasAdultContent_;
        }
        private void initFields() {
            appid_ = 0;
            name_ = "";
            icon_ = "";
            logo_ = "";
            logoSmall_ = "";
            tool_ = false;
            demo_ = false;
            media_ = false;
            communityVisibleStats_ = false;
            friendlyName_ = "";
            propagation_ = "";
            hasAdultContent_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, appid_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getNameBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getIconBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getLogoBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getLogoSmallBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBool(6, tool_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeBool(7, demo_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeBool(8, media_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                output.writeBool(9, communityVisibleStats_);
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                output.writeBytes(10, getFriendlyNameBytes());
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                output.writeBytes(11, getPropagationBytes());
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                output.writeBool(12, hasAdultContent_);
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, appid_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getNameBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getIconBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getLogoBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5, getLogoSmallBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(6, tool_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(7, demo_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(8, media_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(9, communityVisibleStats_);
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(10, getFriendlyNameBytes());
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(11, getPropagationBytes());
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(12, hasAdultContent_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }
        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CCDDBAppDetailCommon parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgBase.CCDDBAppDetailCommon prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }
        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CCDDBAppDetailCommon}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgBase.CCDDBAppDetailCommonOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgBase.internal_static_CCDDBAppDetailCommon_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgBase.internal_static_CCDDBAppDetailCommon_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgBase.CCDDBAppDetailCommon.class, SteamMsgBase.CCDDBAppDetailCommon.Builder.class);
            }
            // Construct using SteamMsgBase.CCDDBAppDetailCommon.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }
            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                appid_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                name_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                icon_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                logo_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                logoSmall_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                tool_ = false;
                bitField0_ = (bitField0_ & ~0x00000020);
                demo_ = false;
                bitField0_ = (bitField0_ & ~0x00000040);
                media_ = false;
                bitField0_ = (bitField0_ & ~0x00000080);
                communityVisibleStats_ = false;
                bitField0_ = (bitField0_ & ~0x00000100);
                friendlyName_ = "";
                bitField0_ = (bitField0_ & ~0x00000200);
                propagation_ = "";
                bitField0_ = (bitField0_ & ~0x00000400);
                hasAdultContent_ = false;
                bitField0_ = (bitField0_ & ~0x00000800);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgBase.internal_static_CCDDBAppDetailCommon_descriptor;
            }
            public SteamMsgBase.CCDDBAppDetailCommon getDefaultInstanceForType() {
                return SteamMsgBase.CCDDBAppDetailCommon.getDefaultInstance();
            }
            public SteamMsgBase.CCDDBAppDetailCommon build() {
                SteamMsgBase.CCDDBAppDetailCommon result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgBase.CCDDBAppDetailCommon buildPartial() {
                SteamMsgBase.CCDDBAppDetailCommon result = new SteamMsgBase.CCDDBAppDetailCommon(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.appid_ = appid_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.name_ = name_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.icon_ = icon_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.logo_ = logo_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.logoSmall_ = logoSmall_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.tool_ = tool_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.demo_ = demo_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.media_ = media_;
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000100;
                }
                result.communityVisibleStats_ = communityVisibleStats_;
                if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
                    to_bitField0_ |= 0x00000200;
                }
                result.friendlyName_ = friendlyName_;
                if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
                    to_bitField0_ |= 0x00000400;
                }
                result.propagation_ = propagation_;
                if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
                    to_bitField0_ |= 0x00000800;
                }
                result.hasAdultContent_ = hasAdultContent_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgBase.CCDDBAppDetailCommon) {
                    return mergeFrom((SteamMsgBase.CCDDBAppDetailCommon)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgBase.CCDDBAppDetailCommon other) {
                if (other == SteamMsgBase.CCDDBAppDetailCommon.getDefaultInstance()) return this;
                if (other.hasAppid()) {
                    setAppid(other.getAppid());
                }
                if (other.hasName()) {
                    bitField0_ |= 0x00000002;
                    name_ = other.name_;
                    onChanged();
                }
                if (other.hasIcon()) {
                    bitField0_ |= 0x00000004;
                    icon_ = other.icon_;
                    onChanged();
                }
                if (other.hasLogo()) {
                    bitField0_ |= 0x00000008;
                    logo_ = other.logo_;
                    onChanged();
                }
                if (other.hasLogoSmall()) {
                    bitField0_ |= 0x00000010;
                    logoSmall_ = other.logoSmall_;
                    onChanged();
                }
                if (other.hasTool()) {
                    setTool(other.getTool());
                }
                if (other.hasDemo()) {
                    setDemo(other.getDemo());
                }
                if (other.hasMedia()) {
                    setMedia(other.getMedia());
                }
                if (other.hasCommunityVisibleStats()) {
                    setCommunityVisibleStats(other.getCommunityVisibleStats());
                }
                if (other.hasFriendlyName()) {
                    bitField0_ |= 0x00000200;
                    friendlyName_ = other.friendlyName_;
                    onChanged();
                }
                if (other.hasPropagation()) {
                    bitField0_ |= 0x00000400;
                    propagation_ = other.propagation_;
                    onChanged();
                }
                if (other.hasHasAdultContent()) {
                    setHasAdultContent(other.getHasAdultContent());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgBase.CCDDBAppDetailCommon parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgBase.CCDDBAppDetailCommon) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint32 appid = 1;
            private int appid_ ;
            /**
             * <code>optional uint32 appid = 1;</code>
             */
            public boolean hasAppid() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 appid = 1;</code>
             */
            public int getAppid() {
                return appid_;
            }
            /**
             * <code>optional uint32 appid = 1;</code>
             */
            public Builder setAppid(int value) {
                bitField0_ |= 0x00000001;
                appid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 appid = 1;</code>
             */
            public Builder clearAppid() {
                bitField0_ = (bitField0_ & ~0x00000001);
                appid_ = 0;
                onChanged();
                return this;
            }
            // optional string name = 2;
            private java.lang.Object name_ = "";
            /**
             * <code>optional string name = 2;</code>
             */
            public boolean hasName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                name_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public Builder clearName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }
            /**
             * <code>optional string name = 2;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                name_ = value;
                onChanged();
                return this;
            }
            // optional string icon = 3;
            private java.lang.Object icon_ = "";
            /**
             * <code>optional string icon = 3;</code>
             */
            public boolean hasIcon() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional string icon = 3;</code>
             */
            public java.lang.String getIcon() {
                java.lang.Object ref = icon_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    icon_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string icon = 3;</code>
             */
            public com.google.protobuf.ByteString
            getIconBytes() {
                java.lang.Object ref = icon_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    icon_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string icon = 3;</code>
             */
            public Builder setIcon(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                icon_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string icon = 3;</code>
             */
            public Builder clearIcon() {
                bitField0_ = (bitField0_ & ~0x00000004);
                icon_ = getDefaultInstance().getIcon();
                onChanged();
                return this;
            }
            /**
             * <code>optional string icon = 3;</code>
             */
            public Builder setIconBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                icon_ = value;
                onChanged();
                return this;
            }
            // optional string logo = 4;
            private java.lang.Object logo_ = "";
            /**
             * <code>optional string logo = 4;</code>
             */
            public boolean hasLogo() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional string logo = 4;</code>
             */
            public java.lang.String getLogo() {
                java.lang.Object ref = logo_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    logo_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string logo = 4;</code>
             */
            public com.google.protobuf.ByteString
            getLogoBytes() {
                java.lang.Object ref = logo_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    logo_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string logo = 4;</code>
             */
            public Builder setLogo(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                logo_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string logo = 4;</code>
             */
            public Builder clearLogo() {
                bitField0_ = (bitField0_ & ~0x00000008);
                logo_ = getDefaultInstance().getLogo();
                onChanged();
                return this;
            }
            /**
             * <code>optional string logo = 4;</code>
             */
            public Builder setLogoBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                logo_ = value;
                onChanged();
                return this;
            }
            // optional string logo_small = 5;
            private java.lang.Object logoSmall_ = "";
            /**
             * <code>optional string logo_small = 5;</code>
             */
            public boolean hasLogoSmall() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional string logo_small = 5;</code>
             */
            public java.lang.String getLogoSmall() {
                java.lang.Object ref = logoSmall_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    logoSmall_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string logo_small = 5;</code>
             */
            public com.google.protobuf.ByteString
            getLogoSmallBytes() {
                java.lang.Object ref = logoSmall_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    logoSmall_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string logo_small = 5;</code>
             */
            public Builder setLogoSmall(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                logoSmall_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string logo_small = 5;</code>
             */
            public Builder clearLogoSmall() {
                bitField0_ = (bitField0_ & ~0x00000010);
                logoSmall_ = getDefaultInstance().getLogoSmall();
                onChanged();
                return this;
            }
            /**
             * <code>optional string logo_small = 5;</code>
             */
            public Builder setLogoSmallBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                logoSmall_ = value;
                onChanged();
                return this;
            }
            // optional bool tool = 6;
            private boolean tool_ ;
            /**
             * <code>optional bool tool = 6;</code>
             */
            public boolean hasTool() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional bool tool = 6;</code>
             */
            public boolean getTool() {
                return tool_;
            }
            /**
             * <code>optional bool tool = 6;</code>
             */
            public Builder setTool(boolean value) {
                bitField0_ |= 0x00000020;
                tool_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool tool = 6;</code>
             */
            public Builder clearTool() {
                bitField0_ = (bitField0_ & ~0x00000020);
                tool_ = false;
                onChanged();
                return this;
            }
            // optional bool demo = 7;
            private boolean demo_ ;
            /**
             * <code>optional bool demo = 7;</code>
             */
            public boolean hasDemo() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional bool demo = 7;</code>
             */
            public boolean getDemo() {
                return demo_;
            }
            /**
             * <code>optional bool demo = 7;</code>
             */
            public Builder setDemo(boolean value) {
                bitField0_ |= 0x00000040;
                demo_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool demo = 7;</code>
             */
            public Builder clearDemo() {
                bitField0_ = (bitField0_ & ~0x00000040);
                demo_ = false;
                onChanged();
                return this;
            }
            // optional bool media = 8;
            private boolean media_ ;
            /**
             * <code>optional bool media = 8;</code>
             */
            public boolean hasMedia() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional bool media = 8;</code>
             */
            public boolean getMedia() {
                return media_;
            }
            /**
             * <code>optional bool media = 8;</code>
             */
            public Builder setMedia(boolean value) {
                bitField0_ |= 0x00000080;
                media_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool media = 8;</code>
             */
            public Builder clearMedia() {
                bitField0_ = (bitField0_ & ~0x00000080);
                media_ = false;
                onChanged();
                return this;
            }
            // optional bool community_visible_stats = 9;
            private boolean communityVisibleStats_ ;
            /**
             * <code>optional bool community_visible_stats = 9;</code>
             */
            public boolean hasCommunityVisibleStats() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>optional bool community_visible_stats = 9;</code>
             */
            public boolean getCommunityVisibleStats() {
                return communityVisibleStats_;
            }
            /**
             * <code>optional bool community_visible_stats = 9;</code>
             */
            public Builder setCommunityVisibleStats(boolean value) {
                bitField0_ |= 0x00000100;
                communityVisibleStats_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool community_visible_stats = 9;</code>
             */
            public Builder clearCommunityVisibleStats() {
                bitField0_ = (bitField0_ & ~0x00000100);
                communityVisibleStats_ = false;
                onChanged();
                return this;
            }
            // optional string friendly_name = 10;
            private java.lang.Object friendlyName_ = "";
            /**
             * <code>optional string friendly_name = 10;</code>
             */
            public boolean hasFriendlyName() {
                return ((bitField0_ & 0x00000200) == 0x00000200);
            }
            /**
             * <code>optional string friendly_name = 10;</code>
             */
            public java.lang.String getFriendlyName() {
                java.lang.Object ref = friendlyName_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    friendlyName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string friendly_name = 10;</code>
             */
            public com.google.protobuf.ByteString
            getFriendlyNameBytes() {
                java.lang.Object ref = friendlyName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    friendlyName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string friendly_name = 10;</code>
             */
            public Builder setFriendlyName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000200;
                friendlyName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string friendly_name = 10;</code>
             */
            public Builder clearFriendlyName() {
                bitField0_ = (bitField0_ & ~0x00000200);
                friendlyName_ = getDefaultInstance().getFriendlyName();
                onChanged();
                return this;
            }
            /**
             * <code>optional string friendly_name = 10;</code>
             */
            public Builder setFriendlyNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000200;
                friendlyName_ = value;
                onChanged();
                return this;
            }
            // optional string propagation = 11;
            private java.lang.Object propagation_ = "";
            /**
             * <code>optional string propagation = 11;</code>
             */
            public boolean hasPropagation() {
                return ((bitField0_ & 0x00000400) == 0x00000400);
            }
            /**
             * <code>optional string propagation = 11;</code>
             */
            public java.lang.String getPropagation() {
                java.lang.Object ref = propagation_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    propagation_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string propagation = 11;</code>
             */
            public com.google.protobuf.ByteString
            getPropagationBytes() {
                java.lang.Object ref = propagation_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    propagation_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string propagation = 11;</code>
             */
            public Builder setPropagation(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000400;
                propagation_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string propagation = 11;</code>
             */
            public Builder clearPropagation() {
                bitField0_ = (bitField0_ & ~0x00000400);
                propagation_ = getDefaultInstance().getPropagation();
                onChanged();
                return this;
            }
            /**
             * <code>optional string propagation = 11;</code>
             */
            public Builder setPropagationBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000400;
                propagation_ = value;
                onChanged();
                return this;
            }
            // optional bool has_adult_content = 12;
            private boolean hasAdultContent_ ;
            /**
             * <code>optional bool has_adult_content = 12;</code>
             */
            public boolean hasHasAdultContent() {
                return ((bitField0_ & 0x00000800) == 0x00000800);
            }
            /**
             * <code>optional bool has_adult_content = 12;</code>
             */
            public boolean getHasAdultContent() {
                return hasAdultContent_;
            }
            /**
             * <code>optional bool has_adult_content = 12;</code>
             */
            public Builder setHasAdultContent(boolean value) {
                bitField0_ |= 0x00000800;
                hasAdultContent_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool has_adult_content = 12;</code>
             */
            public Builder clearHasAdultContent() {
                bitField0_ = (bitField0_ & ~0x00000800);
                hasAdultContent_ = false;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CCDDBAppDetailCommon)
        }
        static {
            defaultInstance = new CCDDBAppDetailCommon(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CCDDBAppDetailCommon)
    }
    public interface CMsgAppRightsOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional bool edit_info = 1;
        /**
         * <code>optional bool edit_info = 1;</code>
         */
        boolean hasEditInfo();
        /**
         * <code>optional bool edit_info = 1;</code>
         */
        boolean getEditInfo();
// optional bool publish = 2;
        /**
         * <code>optional bool publish = 2;</code>
         */
        boolean hasPublish();
        /**
         * <code>optional bool publish = 2;</code>
         */
        boolean getPublish();
// optional bool view_error_data = 3;
        /**
         * <code>optional bool view_error_data = 3;</code>
         */
        boolean hasViewErrorData();
        /**
         * <code>optional bool view_error_data = 3;</code>
         */
        boolean getViewErrorData();
// optional bool download = 4;
        /**
         * <code>optional bool download = 4;</code>
         */
        boolean hasDownload();
        /**
         * <code>optional bool download = 4;</code>
         */
        boolean getDownload();
// optional bool upload_cdkeys = 5;
        /**
         * <code>optional bool upload_cdkeys = 5;</code>
         */
        boolean hasUploadCdkeys();
        /**
         * <code>optional bool upload_cdkeys = 5;</code>
         */
        boolean getUploadCdkeys();
// optional bool generate_cdkeys = 6;
        /**
         * <code>optional bool generate_cdkeys = 6;</code>
         */
        boolean hasGenerateCdkeys();
        /**
         * <code>optional bool generate_cdkeys = 6;</code>
         */
        boolean getGenerateCdkeys();
// optional bool view_financials = 7;
        /**
         * <code>optional bool view_financials = 7;</code>
         */
        boolean hasViewFinancials();
        /**
         * <code>optional bool view_financials = 7;</code>
         */
        boolean getViewFinancials();
// optional bool manage_ceg = 8;
        /**
         * <code>optional bool manage_ceg = 8;</code>
         */
        boolean hasManageCeg();
        /**
         * <code>optional bool manage_ceg = 8;</code>
         */
        boolean getManageCeg();
// optional bool manage_signing = 9;
        /**
         * <code>optional bool manage_signing = 9;</code>
         */
        boolean hasManageSigning();
        /**
         * <code>optional bool manage_signing = 9;</code>
         */
        boolean getManageSigning();
// optional bool manage_cdkeys = 10;
        /**
         * <code>optional bool manage_cdkeys = 10;</code>
         */
        boolean hasManageCdkeys();
        /**
         * <code>optional bool manage_cdkeys = 10;</code>
         */
        boolean getManageCdkeys();
// optional bool edit_marketing = 11;
        /**
         * <code>optional bool edit_marketing = 11;</code>
         */
        boolean hasEditMarketing();
        /**
         * <code>optional bool edit_marketing = 11;</code>
         */
        boolean getEditMarketing();
// optional bool economy_support = 12;
        /**
         * <code>optional bool economy_support = 12;</code>
         */
        boolean hasEconomySupport();
        /**
         * <code>optional bool economy_support = 12;</code>
         */
        boolean getEconomySupport();
// optional bool economy_support_supervisor = 13;
        /**
         * <code>optional bool economy_support_supervisor = 13;</code>
         */
        boolean hasEconomySupportSupervisor();
        /**
         * <code>optional bool economy_support_supervisor = 13;</code>
         */
        boolean getEconomySupportSupervisor();
    }
    /**
     * Protobuf type {@code CMsgAppRights}
     */
    public static final class CMsgAppRights extends
            com.google.protobuf.GeneratedMessage
            implements CMsgAppRightsOrBuilder {
        // Use CMsgAppRights.newBuilder() to construct.
        private CMsgAppRights(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgAppRights(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgAppRights defaultInstance;
        public static CMsgAppRights getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgAppRights getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgAppRights(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            editInfo_ = input.readBool();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            publish_ = input.readBool();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            viewErrorData_ = input.readBool();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            download_ = input.readBool();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            uploadCdkeys_ = input.readBool();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            generateCdkeys_ = input.readBool();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            viewFinancials_ = input.readBool();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000080;
                            manageCeg_ = input.readBool();
                            break;
                        }
                        case 72: {
                            bitField0_ |= 0x00000100;
                            manageSigning_ = input.readBool();
                            break;
                        }
                        case 80: {
                            bitField0_ |= 0x00000200;
                            manageCdkeys_ = input.readBool();
                            break;
                        }
                        case 88: {
                            bitField0_ |= 0x00000400;
                            editMarketing_ = input.readBool();
                            break;
                        }
                        case 96: {
                            bitField0_ |= 0x00000800;
                            economySupport_ = input.readBool();
                            break;
                        }
                        case 104: {
                            bitField0_ |= 0x00001000;
                            economySupportSupervisor_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgBase.internal_static_CMsgAppRights_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgBase.internal_static_CMsgAppRights_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgBase.CMsgAppRights.class, SteamMsgBase.CMsgAppRights.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgAppRights> PARSER =
                new com.google.protobuf.AbstractParser<CMsgAppRights>() {
                    public CMsgAppRights parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgAppRights(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgAppRights> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional bool edit_info = 1;
        public static final int EDIT_INFO_FIELD_NUMBER = 1;
        private boolean editInfo_;
        /**
         * <code>optional bool edit_info = 1;</code>
         */
        public boolean hasEditInfo() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional bool edit_info = 1;</code>
         */
        public boolean getEditInfo() {
            return editInfo_;
        }
        // optional bool publish = 2;
        public static final int PUBLISH_FIELD_NUMBER = 2;
        private boolean publish_;
        /**
         * <code>optional bool publish = 2;</code>
         */
        public boolean hasPublish() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bool publish = 2;</code>
         */
        public boolean getPublish() {
            return publish_;
        }
        // optional bool view_error_data = 3;
        public static final int VIEW_ERROR_DATA_FIELD_NUMBER = 3;
        private boolean viewErrorData_;
        /**
         * <code>optional bool view_error_data = 3;</code>
         */
        public boolean hasViewErrorData() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional bool view_error_data = 3;</code>
         */
        public boolean getViewErrorData() {
            return viewErrorData_;
        }
        // optional bool download = 4;
        public static final int DOWNLOAD_FIELD_NUMBER = 4;
        private boolean download_;
        /**
         * <code>optional bool download = 4;</code>
         */
        public boolean hasDownload() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional bool download = 4;</code>
         */
        public boolean getDownload() {
            return download_;
        }
        // optional bool upload_cdkeys = 5;
        public static final int UPLOAD_CDKEYS_FIELD_NUMBER = 5;
        private boolean uploadCdkeys_;
        /**
         * <code>optional bool upload_cdkeys = 5;</code>
         */
        public boolean hasUploadCdkeys() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional bool upload_cdkeys = 5;</code>
         */
        public boolean getUploadCdkeys() {
            return uploadCdkeys_;
        }
        // optional bool generate_cdkeys = 6;
        public static final int GENERATE_CDKEYS_FIELD_NUMBER = 6;
        private boolean generateCdkeys_;
        /**
         * <code>optional bool generate_cdkeys = 6;</code>
         */
        public boolean hasGenerateCdkeys() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional bool generate_cdkeys = 6;</code>
         */
        public boolean getGenerateCdkeys() {
            return generateCdkeys_;
        }
        // optional bool view_financials = 7;
        public static final int VIEW_FINANCIALS_FIELD_NUMBER = 7;
        private boolean viewFinancials_;
        /**
         * <code>optional bool view_financials = 7;</code>
         */
        public boolean hasViewFinancials() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional bool view_financials = 7;</code>
         */
        public boolean getViewFinancials() {
            return viewFinancials_;
        }
        // optional bool manage_ceg = 8;
        public static final int MANAGE_CEG_FIELD_NUMBER = 8;
        private boolean manageCeg_;
        /**
         * <code>optional bool manage_ceg = 8;</code>
         */
        public boolean hasManageCeg() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional bool manage_ceg = 8;</code>
         */
        public boolean getManageCeg() {
            return manageCeg_;
        }
        // optional bool manage_signing = 9;
        public static final int MANAGE_SIGNING_FIELD_NUMBER = 9;
        private boolean manageSigning_;
        /**
         * <code>optional bool manage_signing = 9;</code>
         */
        public boolean hasManageSigning() {
            return ((bitField0_ & 0x00000100) == 0x00000100);
        }
        /**
         * <code>optional bool manage_signing = 9;</code>
         */
        public boolean getManageSigning() {
            return manageSigning_;
        }
        // optional bool manage_cdkeys = 10;
        public static final int MANAGE_CDKEYS_FIELD_NUMBER = 10;
        private boolean manageCdkeys_;
        /**
         * <code>optional bool manage_cdkeys = 10;</code>
         */
        public boolean hasManageCdkeys() {
            return ((bitField0_ & 0x00000200) == 0x00000200);
        }
        /**
         * <code>optional bool manage_cdkeys = 10;</code>
         */
        public boolean getManageCdkeys() {
            return manageCdkeys_;
        }
        // optional bool edit_marketing = 11;
        public static final int EDIT_MARKETING_FIELD_NUMBER = 11;
        private boolean editMarketing_;
        /**
         * <code>optional bool edit_marketing = 11;</code>
         */
        public boolean hasEditMarketing() {
            return ((bitField0_ & 0x00000400) == 0x00000400);
        }
        /**
         * <code>optional bool edit_marketing = 11;</code>
         */
        public boolean getEditMarketing() {
            return editMarketing_;
        }
        // optional bool economy_support = 12;
        public static final int ECONOMY_SUPPORT_FIELD_NUMBER = 12;
        private boolean economySupport_;
        /**
         * <code>optional bool economy_support = 12;</code>
         */
        public boolean hasEconomySupport() {
            return ((bitField0_ & 0x00000800) == 0x00000800);
        }
        /**
         * <code>optional bool economy_support = 12;</code>
         */
        public boolean getEconomySupport() {
            return economySupport_;
        }
        // optional bool economy_support_supervisor = 13;
        public static final int ECONOMY_SUPPORT_SUPERVISOR_FIELD_NUMBER = 13;
        private boolean economySupportSupervisor_;
        /**
         * <code>optional bool economy_support_supervisor = 13;</code>
         */
        public boolean hasEconomySupportSupervisor() {
            return ((bitField0_ & 0x00001000) == 0x00001000);
        }
        /**
         * <code>optional bool economy_support_supervisor = 13;</code>
         */
        public boolean getEconomySupportSupervisor() {
            return economySupportSupervisor_;
        }
        private void initFields() {
            editInfo_ = false;
            publish_ = false;
            viewErrorData_ = false;
            download_ = false;
            uploadCdkeys_ = false;
            generateCdkeys_ = false;
            viewFinancials_ = false;
            manageCeg_ = false;
            manageSigning_ = false;
            manageCdkeys_ = false;
            editMarketing_ = false;
            economySupport_ = false;
            economySupportSupervisor_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBool(1, editInfo_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBool(2, publish_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBool(3, viewErrorData_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBool(4, download_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBool(5, uploadCdkeys_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBool(6, generateCdkeys_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeBool(7, viewFinancials_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeBool(8, manageCeg_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                output.writeBool(9, manageSigning_);
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                output.writeBool(10, manageCdkeys_);
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                output.writeBool(11, editMarketing_);
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                output.writeBool(12, economySupport_);
            }
            if (((bitField0_ & 0x00001000) == 0x00001000)) {
                output.writeBool(13, economySupportSupervisor_);
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(1, editInfo_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, publish_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, viewErrorData_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(4, download_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(5, uploadCdkeys_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(6, generateCdkeys_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(7, viewFinancials_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(8, manageCeg_);
            }
            if (((bitField0_ & 0x00000100) == 0x00000100)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(9, manageSigning_);
            }
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(10, manageCdkeys_);
            }
            if (((bitField0_ & 0x00000400) == 0x00000400)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(11, editMarketing_);
            }
            if (((bitField0_ & 0x00000800) == 0x00000800)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(12, economySupport_);
            }
            if (((bitField0_ & 0x00001000) == 0x00001000)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(13, economySupportSupervisor_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }
        private static final long serialVersionUID = 0L;
        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAppRights parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgBase.CMsgAppRights parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgBase.CMsgAppRights parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgBase.CMsgAppRights prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() { return newBuilder(this); }
        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CMsgAppRights}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgBase.CMsgAppRightsOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgBase.internal_static_CMsgAppRights_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgBase.internal_static_CMsgAppRights_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgBase.CMsgAppRights.class, SteamMsgBase.CMsgAppRights.Builder.class);
            }
            // Construct using SteamMsgBase.CMsgAppRights.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }
            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                editInfo_ = false;
                bitField0_ = (bitField0_ & ~0x00000001);
                publish_ = false;
                bitField0_ = (bitField0_ & ~0x00000002);
                viewErrorData_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                download_ = false;
                bitField0_ = (bitField0_ & ~0x00000008);
                uploadCdkeys_ = false;
                bitField0_ = (bitField0_ & ~0x00000010);
                generateCdkeys_ = false;
                bitField0_ = (bitField0_ & ~0x00000020);
                viewFinancials_ = false;
                bitField0_ = (bitField0_ & ~0x00000040);
                manageCeg_ = false;
                bitField0_ = (bitField0_ & ~0x00000080);
                manageSigning_ = false;
                bitField0_ = (bitField0_ & ~0x00000100);
                manageCdkeys_ = false;
                bitField0_ = (bitField0_ & ~0x00000200);
                editMarketing_ = false;
                bitField0_ = (bitField0_ & ~0x00000400);
                economySupport_ = false;
                bitField0_ = (bitField0_ & ~0x00000800);
                economySupportSupervisor_ = false;
                bitField0_ = (bitField0_ & ~0x00001000);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgBase.internal_static_CMsgAppRights_descriptor;
            }
            public SteamMsgBase.CMsgAppRights getDefaultInstanceForType() {
                return SteamMsgBase.CMsgAppRights.getDefaultInstance();
            }
            public SteamMsgBase.CMsgAppRights build() {
                SteamMsgBase.CMsgAppRights result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgBase.CMsgAppRights buildPartial() {
                SteamMsgBase.CMsgAppRights result = new SteamMsgBase.CMsgAppRights(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.editInfo_ = editInfo_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.publish_ = publish_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.viewErrorData_ = viewErrorData_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.download_ = download_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.uploadCdkeys_ = uploadCdkeys_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.generateCdkeys_ = generateCdkeys_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.viewFinancials_ = viewFinancials_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.manageCeg_ = manageCeg_;
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000100;
                }
                result.manageSigning_ = manageSigning_;
                if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
                    to_bitField0_ |= 0x00000200;
                }
                result.manageCdkeys_ = manageCdkeys_;
                if (((from_bitField0_ & 0x00000400) == 0x00000400)) {
                    to_bitField0_ |= 0x00000400;
                }
                result.editMarketing_ = editMarketing_;
                if (((from_bitField0_ & 0x00000800) == 0x00000800)) {
                    to_bitField0_ |= 0x00000800;
                }
                result.economySupport_ = economySupport_;
                if (((from_bitField0_ & 0x00001000) == 0x00001000)) {
                    to_bitField0_ |= 0x00001000;
                }
                result.economySupportSupervisor_ = economySupportSupervisor_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgBase.CMsgAppRights) {
                    return mergeFrom((SteamMsgBase.CMsgAppRights)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgBase.CMsgAppRights other) {
                if (other == SteamMsgBase.CMsgAppRights.getDefaultInstance()) return this;
                if (other.hasEditInfo()) {
                    setEditInfo(other.getEditInfo());
                }
                if (other.hasPublish()) {
                    setPublish(other.getPublish());
                }
                if (other.hasViewErrorData()) {
                    setViewErrorData(other.getViewErrorData());
                }
                if (other.hasDownload()) {
                    setDownload(other.getDownload());
                }
                if (other.hasUploadCdkeys()) {
                    setUploadCdkeys(other.getUploadCdkeys());
                }
                if (other.hasGenerateCdkeys()) {
                    setGenerateCdkeys(other.getGenerateCdkeys());
                }
                if (other.hasViewFinancials()) {
                    setViewFinancials(other.getViewFinancials());
                }
                if (other.hasManageCeg()) {
                    setManageCeg(other.getManageCeg());
                }
                if (other.hasManageSigning()) {
                    setManageSigning(other.getManageSigning());
                }
                if (other.hasManageCdkeys()) {
                    setManageCdkeys(other.getManageCdkeys());
                }
                if (other.hasEditMarketing()) {
                    setEditMarketing(other.getEditMarketing());
                }
                if (other.hasEconomySupport()) {
                    setEconomySupport(other.getEconomySupport());
                }
                if (other.hasEconomySupportSupervisor()) {
                    setEconomySupportSupervisor(other.getEconomySupportSupervisor());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgBase.CMsgAppRights parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgBase.CMsgAppRights) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional bool edit_info = 1;
            private boolean editInfo_ ;
            /**
             * <code>optional bool edit_info = 1;</code>
             */
            public boolean hasEditInfo() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional bool edit_info = 1;</code>
             */
            public boolean getEditInfo() {
                return editInfo_;
            }
            /**
             * <code>optional bool edit_info = 1;</code>
             */
            public Builder setEditInfo(boolean value) {
                bitField0_ |= 0x00000001;
                editInfo_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool edit_info = 1;</code>
             */
            public Builder clearEditInfo() {
                bitField0_ = (bitField0_ & ~0x00000001);
                editInfo_ = false;
                onChanged();
                return this;
            }
            // optional bool publish = 2;
            private boolean publish_ ;
            /**
             * <code>optional bool publish = 2;</code>
             */
            public boolean hasPublish() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bool publish = 2;</code>
             */
            public boolean getPublish() {
                return publish_;
            }
            /**
             * <code>optional bool publish = 2;</code>
             */
            public Builder setPublish(boolean value) {
                bitField0_ |= 0x00000002;
                publish_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool publish = 2;</code>
             */
            public Builder clearPublish() {
                bitField0_ = (bitField0_ & ~0x00000002);
                publish_ = false;
                onChanged();
                return this;
            }
            // optional bool view_error_data = 3;
            private boolean viewErrorData_ ;
            /**
             * <code>optional bool view_error_data = 3;</code>
             */
            public boolean hasViewErrorData() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional bool view_error_data = 3;</code>
             */
            public boolean getViewErrorData() {
                return viewErrorData_;
            }
            /**
             * <code>optional bool view_error_data = 3;</code>
             */
            public Builder setViewErrorData(boolean value) {
                bitField0_ |= 0x00000004;
                viewErrorData_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool view_error_data = 3;</code>
             */
            public Builder clearViewErrorData() {
                bitField0_ = (bitField0_ & ~0x00000004);
                viewErrorData_ = false;
                onChanged();
                return this;
            }
            // optional bool download = 4;
            private boolean download_ ;
            /**
             * <code>optional bool download = 4;</code>
             */
            public boolean hasDownload() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional bool download = 4;</code>
             */
            public boolean getDownload() {
                return download_;
            }
            /**
             * <code>optional bool download = 4;</code>
             */
            public Builder setDownload(boolean value) {
                bitField0_ |= 0x00000008;
                download_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool download = 4;</code>
             */
            public Builder clearDownload() {
                bitField0_ = (bitField0_ & ~0x00000008);
                download_ = false;
                onChanged();
                return this;
            }
            // optional bool upload_cdkeys = 5;
            private boolean uploadCdkeys_ ;
            /**
             * <code>optional bool upload_cdkeys = 5;</code>
             */
            public boolean hasUploadCdkeys() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional bool upload_cdkeys = 5;</code>
             */
            public boolean getUploadCdkeys() {
                return uploadCdkeys_;
            }
            /**
             * <code>optional bool upload_cdkeys = 5;</code>
             */
            public Builder setUploadCdkeys(boolean value) {
                bitField0_ |= 0x00000010;
                uploadCdkeys_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool upload_cdkeys = 5;</code>
             */
            public Builder clearUploadCdkeys() {
                bitField0_ = (bitField0_ & ~0x00000010);
                uploadCdkeys_ = false;
                onChanged();
                return this;
            }
            // optional bool generate_cdkeys = 6;
            private boolean generateCdkeys_ ;
            /**
             * <code>optional bool generate_cdkeys = 6;</code>
             */
            public boolean hasGenerateCdkeys() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional bool generate_cdkeys = 6;</code>
             */
            public boolean getGenerateCdkeys() {
                return generateCdkeys_;
            }
            /**
             * <code>optional bool generate_cdkeys = 6;</code>
             */
            public Builder setGenerateCdkeys(boolean value) {
                bitField0_ |= 0x00000020;
                generateCdkeys_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool generate_cdkeys = 6;</code>
             */
            public Builder clearGenerateCdkeys() {
                bitField0_ = (bitField0_ & ~0x00000020);
                generateCdkeys_ = false;
                onChanged();
                return this;
            }
            // optional bool view_financials = 7;
            private boolean viewFinancials_ ;
            /**
             * <code>optional bool view_financials = 7;</code>
             */
            public boolean hasViewFinancials() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional bool view_financials = 7;</code>
             */
            public boolean getViewFinancials() {
                return viewFinancials_;
            }
            /**
             * <code>optional bool view_financials = 7;</code>
             */
            public Builder setViewFinancials(boolean value) {
                bitField0_ |= 0x00000040;
                viewFinancials_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool view_financials = 7;</code>
             */
            public Builder clearViewFinancials() {
                bitField0_ = (bitField0_ & ~0x00000040);
                viewFinancials_ = false;
                onChanged();
                return this;
            }
            // optional bool manage_ceg = 8;
            private boolean manageCeg_ ;
            /**
             * <code>optional bool manage_ceg = 8;</code>
             */
            public boolean hasManageCeg() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional bool manage_ceg = 8;</code>
             */
            public boolean getManageCeg() {
                return manageCeg_;
            }
            /**
             * <code>optional bool manage_ceg = 8;</code>
             */
            public Builder setManageCeg(boolean value) {
                bitField0_ |= 0x00000080;
                manageCeg_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool manage_ceg = 8;</code>
             */
            public Builder clearManageCeg() {
                bitField0_ = (bitField0_ & ~0x00000080);
                manageCeg_ = false;
                onChanged();
                return this;
            }
            // optional bool manage_signing = 9;
            private boolean manageSigning_ ;
            /**
             * <code>optional bool manage_signing = 9;</code>
             */
            public boolean hasManageSigning() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>optional bool manage_signing = 9;</code>
             */
            public boolean getManageSigning() {
                return manageSigning_;
            }
            /**
             * <code>optional bool manage_signing = 9;</code>
             */
            public Builder setManageSigning(boolean value) {
                bitField0_ |= 0x00000100;
                manageSigning_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool manage_signing = 9;</code>
             */
            public Builder clearManageSigning() {
                bitField0_ = (bitField0_ & ~0x00000100);
                manageSigning_ = false;
                onChanged();
                return this;
            }
            // optional bool manage_cdkeys = 10;
            private boolean manageCdkeys_ ;
            /**
             * <code>optional bool manage_cdkeys = 10;</code>
             */
            public boolean hasManageCdkeys() {
                return ((bitField0_ & 0x00000200) == 0x00000200);
            }
            /**
             * <code>optional bool manage_cdkeys = 10;</code>
             */
            public boolean getManageCdkeys() {
                return manageCdkeys_;
            }
            /**
             * <code>optional bool manage_cdkeys = 10;</code>
             */
            public Builder setManageCdkeys(boolean value) {
                bitField0_ |= 0x00000200;
                manageCdkeys_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool manage_cdkeys = 10;</code>
             */
            public Builder clearManageCdkeys() {
                bitField0_ = (bitField0_ & ~0x00000200);
                manageCdkeys_ = false;
                onChanged();
                return this;
            }
            // optional bool edit_marketing = 11;
            private boolean editMarketing_ ;
            /**
             * <code>optional bool edit_marketing = 11;</code>
             */
            public boolean hasEditMarketing() {
                return ((bitField0_ & 0x00000400) == 0x00000400);
            }
            /**
             * <code>optional bool edit_marketing = 11;</code>
             */
            public boolean getEditMarketing() {
                return editMarketing_;
            }
            /**
             * <code>optional bool edit_marketing = 11;</code>
             */
            public Builder setEditMarketing(boolean value) {
                bitField0_ |= 0x00000400;
                editMarketing_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool edit_marketing = 11;</code>
             */
            public Builder clearEditMarketing() {
                bitField0_ = (bitField0_ & ~0x00000400);
                editMarketing_ = false;
                onChanged();
                return this;
            }
            // optional bool economy_support = 12;
            private boolean economySupport_ ;
            /**
             * <code>optional bool economy_support = 12;</code>
             */
            public boolean hasEconomySupport() {
                return ((bitField0_ & 0x00000800) == 0x00000800);
            }
            /**
             * <code>optional bool economy_support = 12;</code>
             */
            public boolean getEconomySupport() {
                return economySupport_;
            }
            /**
             * <code>optional bool economy_support = 12;</code>
             */
            public Builder setEconomySupport(boolean value) {
                bitField0_ |= 0x00000800;
                economySupport_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool economy_support = 12;</code>
             */
            public Builder clearEconomySupport() {
                bitField0_ = (bitField0_ & ~0x00000800);
                economySupport_ = false;
                onChanged();
                return this;
            }
            // optional bool economy_support_supervisor = 13;
            private boolean economySupportSupervisor_ ;
            /**
             * <code>optional bool economy_support_supervisor = 13;</code>
             */
            public boolean hasEconomySupportSupervisor() {
                return ((bitField0_ & 0x00001000) == 0x00001000);
            }
            /**
             * <code>optional bool economy_support_supervisor = 13;</code>
             */
            public boolean getEconomySupportSupervisor() {
                return economySupportSupervisor_;
            }
            /**
             * <code>optional bool economy_support_supervisor = 13;</code>
             */
            public Builder setEconomySupportSupervisor(boolean value) {
                bitField0_ |= 0x00001000;
                economySupportSupervisor_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool economy_support_supervisor = 13;</code>
             */
            public Builder clearEconomySupportSupervisor() {
                bitField0_ = (bitField0_ & ~0x00001000);
                economySupportSupervisor_ = false;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgAppRights)
        }
        static {
            defaultInstance = new CMsgAppRights(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgAppRights)
    }
    public static final int MSGPOOL_SOFT_LIMIT_FIELD_NUMBER = 50000;
    /**
     * <code>extend .google.protobuf.MessageOptions { ... }</code>
     */
    public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
            com.google.protobuf.DescriptorProtos.MessageOptions,
            java.lang.Integer> msgpoolSoftLimit = com.google.protobuf.GeneratedMessage
            .newFileScopedGeneratedExtension(
                    java.lang.Integer.class,
                    null);
    public static final int MSGPOOL_HARD_LIMIT_FIELD_NUMBER = 50001;
    /**
     * <code>extend .google.protobuf.MessageOptions { ... }</code>
     */
    public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
            com.google.protobuf.DescriptorProtos.MessageOptions,
            java.lang.Integer> msgpoolHardLimit = com.google.protobuf.GeneratedMessage
            .newFileScopedGeneratedExtension(
                    java.lang.Integer.class,
                    null);
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgProtoBufHeader_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgProtoBufHeader_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgMulti_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgMulti_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgProtobufWrapped_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgProtobufWrapped_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgAuthTicket_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgAuthTicket_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CCDDBAppDetailCommon_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CCDDBAppDetailCommon_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgAppRights_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgAppRights_fieldAccessorTable;
    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\030steammessages_base.proto\032 google/proto" +
                        "buf/descriptor.proto\"\341\003\n\022CMsgProtoBufHea" +
                        "der\022\017\n\007steamid\030\001 \001(\006\022\030\n\020client_sessionid" +
                        "\030\002 \001(\005\022\025\n\rrouting_appid\030\003 \001(\r\022*\n\014jobid_s" +
                        "ource\030\n \001(\006:\02418446744073709551615\022*\n\014job" +
                        "id_target\030\013 \001(\006:\02418446744073709551615\022\027\n" +
                        "\017target_job_name\030\014 \001(\t\022\017\n\007seq_num\030\030 \001(\005\022" +
                        "\022\n\007eresult\030\r \001(\005:\0012\022\025\n\rerror_message\030\016 \001" +
                        "(\t\022\n\n\002ip\030\017 \001(\r\022\032\n\022auth_account_flags\030\020 \001" +
                        "(\r\022\024\n\014token_source\030\026 \001(\r\022\033\n\023admin_spoofi",
                "ng_user\030\027 \001(\010\022\032\n\017transport_error\030\021 \001(\005:\001" +
                        "1\022\'\n\tmessageid\030\022 \001(\004:\024184467440737095516" +
                        "15\022\032\n\022publisher_group_id\030\023 \001(\r\022\r\n\005sysid\030" +
                        "\024 \001(\r\022\021\n\ttrace_tag\030\025 \001(\004\"8\n\tCMsgMulti\022\025\n" +
                        "\rsize_unzipped\030\001 \001(\r\022\024\n\014message_body\030\002 \001" +
                        "(\014\"+\n\023CMsgProtobufWrapped\022\024\n\014message_bod" +
                        "y\030\001 \001(\014\"\217\001\n\016CMsgAuthTicket\022\016\n\006estate\030\001 \001" +
                        "(\r\022\022\n\007eresult\030\002 \001(\r:\0012\022\017\n\007steamid\030\003 \001(\006\022" +
                        "\016\n\006gameid\030\004 \001(\006\022\024\n\014h_steam_pipe\030\005 \001(\r\022\022\n" +
                        "\nticket_crc\030\006 \001(\r\022\016\n\006ticket\030\007 \001(\014\"\366\001\n\024CC",
                "DDBAppDetailCommon\022\r\n\005appid\030\001 \001(\r\022\014\n\004nam" +
                        "e\030\002 \001(\t\022\014\n\004icon\030\003 \001(\t\022\014\n\004logo\030\004 \001(\t\022\022\n\nl" +
                        "ogo_small\030\005 \001(\t\022\014\n\004tool\030\006 \001(\010\022\014\n\004demo\030\007 " +
                        "\001(\010\022\r\n\005media\030\010 \001(\010\022\037\n\027community_visible_" +
                        "stats\030\t \001(\010\022\025\n\rfriendly_name\030\n \001(\t\022\023\n\013pr" +
                        "opagation\030\013 \001(\t\022\031\n\021has_adult_content\030\014 \001" +
                        "(\010\"\277\002\n\rCMsgAppRights\022\021\n\tedit_info\030\001 \001(\010\022" +
                        "\017\n\007publish\030\002 \001(\010\022\027\n\017view_error_data\030\003 \001(" +
                        "\010\022\020\n\010download\030\004 \001(\010\022\025\n\rupload_cdkeys\030\005 \001" +
                        "(\010\022\027\n\017generate_cdkeys\030\006 \001(\010\022\027\n\017view_fina",
                "ncials\030\007 \001(\010\022\022\n\nmanage_ceg\030\010 \001(\010\022\026\n\016mana" +
                        "ge_signing\030\t \001(\010\022\025\n\rmanage_cdkeys\030\n \001(\010\022" +
                        "\026\n\016edit_marketing\030\013 \001(\010\022\027\n\017economy_suppo" +
                        "rt\030\014 \001(\010\022\"\n\032economy_support_supervisor\030\r" +
                        " \001(\010:A\n\022msgpool_soft_limit\022\037.google.prot" +
                        "obuf.MessageOptions\030\320\206\003 \001(\005:\00232:B\n\022msgpo" +
                        "ol_hard_limit\022\037.google.protobuf.MessageO" +
                        "ptions\030\321\206\003 \001(\005:\003384B/\n\037net.zhuoweizhang." +
                        "varodahn.protoB\014SteamMsgBase"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_CMsgProtoBufHeader_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_CMsgProtoBufHeader_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgProtoBufHeader_descriptor,
                                new java.lang.String[] { "Steamid", "ClientSessionid", "RoutingAppid", "JobidSource", "JobidTarget", "TargetJobName", "SeqNum", "Eresult", "ErrorMessage", "Ip", "AuthAccountFlags", "TokenSource", "AdminSpoofingUser", "TransportError", "Messageid", "PublisherGroupId", "Sysid", "TraceTag", });
                        internal_static_CMsgMulti_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_CMsgMulti_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgMulti_descriptor,
                                new java.lang.String[] { "SizeUnzipped", "MessageBody", });
                        internal_static_CMsgProtobufWrapped_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_CMsgProtobufWrapped_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgProtobufWrapped_descriptor,
                                new java.lang.String[] { "MessageBody", });
                        internal_static_CMsgAuthTicket_descriptor =
                                getDescriptor().getMessageTypes().get(3);
                        internal_static_CMsgAuthTicket_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgAuthTicket_descriptor,
                                new java.lang.String[] { "Estate", "Eresult", "Steamid", "Gameid", "HSteamPipe", "TicketCrc", "Ticket", });
                        internal_static_CCDDBAppDetailCommon_descriptor =
                                getDescriptor().getMessageTypes().get(4);
                        internal_static_CCDDBAppDetailCommon_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CCDDBAppDetailCommon_descriptor,
                                new java.lang.String[] { "Appid", "Name", "Icon", "Logo", "LogoSmall", "Tool", "Demo", "Media", "CommunityVisibleStats", "FriendlyName", "Propagation", "HasAdultContent", });
                        internal_static_CMsgAppRights_descriptor =
                                getDescriptor().getMessageTypes().get(5);
                        internal_static_CMsgAppRights_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgAppRights_descriptor,
                                new java.lang.String[] { "EditInfo", "Publish", "ViewErrorData", "Download", "UploadCdkeys", "GenerateCdkeys", "ViewFinancials", "ManageCeg", "ManageSigning", "ManageCdkeys", "EditMarketing", "EconomySupport", "EconomySupportSupervisor", });
                        msgpoolSoftLimit.internalInit(descriptor.getExtensions().get(0));
                        msgpoolHardLimit.internalInit(descriptor.getExtensions().get(1));
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                                com.google.protobuf.DescriptorProtos.getDescriptor(),
                        }, assigner);
    }
// @@protoc_insertion_point(outer_class_scope)
}