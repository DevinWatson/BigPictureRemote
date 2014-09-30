package opensteam.bigpictureremote.Discovery.proto;

public final class SteamMsgRemoteClient {
    private SteamMsgRemoteClient() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    /**
     * Protobuf enum {@code ERemoteClientBroadcastMsg}
     */
    public enum ERemoteClientBroadcastMsg
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>k_ERemoteClientBroadcastMsgDiscovery = 0;</code>
         */
        k_ERemoteClientBroadcastMsgDiscovery(0, 0),
        /**
         * <code>k_ERemoteClientBroadcastMsgStatus = 1;</code>
         */
        k_ERemoteClientBroadcastMsgStatus(1, 1),
        /**
         * <code>k_ERemoteClientBroadcastMsgOffline = 2;</code>
         */
        k_ERemoteClientBroadcastMsgOffline(2, 2),
        ;
        /**
         * <code>k_ERemoteClientBroadcastMsgDiscovery = 0;</code>
         */
        public static final int k_ERemoteClientBroadcastMsgDiscovery_VALUE = 0;
        /**
         * <code>k_ERemoteClientBroadcastMsgStatus = 1;</code>
         */
        public static final int k_ERemoteClientBroadcastMsgStatus_VALUE = 1;
        /**
         * <code>k_ERemoteClientBroadcastMsgOffline = 2;</code>
         */
        public static final int k_ERemoteClientBroadcastMsgOffline_VALUE = 2;
        public final int getNumber() { return value; }
        public static ERemoteClientBroadcastMsg valueOf(int value) {
            switch (value) {
                case 0: return k_ERemoteClientBroadcastMsgDiscovery;
                case 1: return k_ERemoteClientBroadcastMsgStatus;
                case 2: return k_ERemoteClientBroadcastMsgOffline;
                default: return null;
            }
        }
        public static com.google.protobuf.Internal.EnumLiteMap<ERemoteClientBroadcastMsg>
        internalGetValueMap() {
            return internalValueMap;
        }
        private static com.google.protobuf.Internal.EnumLiteMap<ERemoteClientBroadcastMsg>
                internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<ERemoteClientBroadcastMsg>() {
                    public ERemoteClientBroadcastMsg findValueByNumber(int number) {
                        return ERemoteClientBroadcastMsg.valueOf(number);
                    }
                };
        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(index);
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return SteamMsgRemoteClient.getDescriptor().getEnumTypes().get(0);
        }
        private static final ERemoteClientBroadcastMsg[] VALUES = values();
        public static ERemoteClientBroadcastMsg valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }
        private final int index;
        private final int value;
        private ERemoteClientBroadcastMsg(int index, int value) {
            this.index = index;
            this.value = value;
        }
// @@protoc_insertion_point(enum_scope:ERemoteClientBroadcastMsg)
    }
    /**
     * Protobuf enum {@code ERemoteClientService}
     */
    public enum ERemoteClientService
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>k_ERemoteClientServiceNone = 0;</code>
         */
        k_ERemoteClientServiceNone(0, 0),
        /**
         * <code>k_ERemoteClientServiceRemoteControl = 1;</code>
         */
        k_ERemoteClientServiceRemoteControl(1, 1),
        /**
         * <code>k_ERemoteClientServiceGameStreaming = 2;</code>
         */
        k_ERemoteClientServiceGameStreaming(2, 2),
        ;
        /**
         * <code>k_ERemoteClientServiceNone = 0;</code>
         */
        public static final int k_ERemoteClientServiceNone_VALUE = 0;
        /**
         * <code>k_ERemoteClientServiceRemoteControl = 1;</code>
         */
        public static final int k_ERemoteClientServiceRemoteControl_VALUE = 1;
        /**
         * <code>k_ERemoteClientServiceGameStreaming = 2;</code>
         */
        public static final int k_ERemoteClientServiceGameStreaming_VALUE = 2;
        public final int getNumber() { return value; }
        public static ERemoteClientService valueOf(int value) {
            switch (value) {
                case 0: return k_ERemoteClientServiceNone;
                case 1: return k_ERemoteClientServiceRemoteControl;
                case 2: return k_ERemoteClientServiceGameStreaming;
                default: return null;
            }
        }
        public static com.google.protobuf.Internal.EnumLiteMap<ERemoteClientService>
        internalGetValueMap() {
            return internalValueMap;
        }
        private static com.google.protobuf.Internal.EnumLiteMap<ERemoteClientService>
                internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<ERemoteClientService>() {
                    public ERemoteClientService findValueByNumber(int number) {
                        return ERemoteClientService.valueOf(number);
                    }
                };
        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(index);
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return SteamMsgRemoteClient.getDescriptor().getEnumTypes().get(1);
        }
        private static final ERemoteClientService[] VALUES = values();
        public static ERemoteClientService valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }
        private final int index;
        private final int value;
        private ERemoteClientService(int index, int value) {
            this.index = index;
            this.value = value;
        }
// @@protoc_insertion_point(enum_scope:ERemoteClientService)
    }
    public interface CMsgRemoteClientBroadcastHeaderOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint64 client_id = 1;
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        boolean hasClientId();
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        long getClientId();
// optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];
        /**
         * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
         */
        boolean hasMsgType();
        /**
         * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
         */
        SteamMsgRemoteClient.ERemoteClientBroadcastMsg getMsgType();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientBroadcastHeader}
     */
    public static final class CMsgRemoteClientBroadcastHeader extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientBroadcastHeaderOrBuilder {
        // Use CMsgRemoteClientBroadcastHeader.newBuilder() to construct.
        private CMsgRemoteClientBroadcastHeader(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientBroadcastHeader(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientBroadcastHeader defaultInstance;
        public static CMsgRemoteClientBroadcastHeader getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientBroadcastHeader getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientBroadcastHeader(
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
                            clientId_ = input.readUInt64();
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();
                            SteamMsgRemoteClient.ERemoteClientBroadcastMsg value = SteamMsgRemoteClient.ERemoteClientBroadcastMsg.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(2, rawValue);
                            } else {
                                bitField0_ |= 0x00000002;
                                msgType_ = value;
                            }
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastHeader_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastHeader_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientBroadcastHeader> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientBroadcastHeader>() {
                    public CMsgRemoteClientBroadcastHeader parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientBroadcastHeader(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientBroadcastHeader> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint64 client_id = 1;
        public static final int CLIENT_ID_FIELD_NUMBER = 1;
        private long clientId_;
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        public boolean hasClientId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        public long getClientId() {
            return clientId_;
        }
        // optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];
        public static final int MSG_TYPE_FIELD_NUMBER = 2;
        private SteamMsgRemoteClient.ERemoteClientBroadcastMsg msgType_;
        /**
         * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
         */
        public boolean hasMsgType() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
         */
        public SteamMsgRemoteClient.ERemoteClientBroadcastMsg getMsgType() {
            return msgType_;
        }
        private void initFields() {
            clientId_ = 0L;
            msgType_ = SteamMsgRemoteClient.ERemoteClientBroadcastMsg.k_ERemoteClientBroadcastMsgDiscovery;
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
                output.writeUInt64(1, clientId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeEnum(2, msgType_.getNumber());
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
                        .computeUInt64Size(1, clientId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(2, msgType_.getNumber());
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
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader prototype) {
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
         * Protobuf type {@code CMsgRemoteClientBroadcastHeader}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeaderOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastHeader_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastHeader_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.newBuilder()
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
                clientId_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                msgType_ = SteamMsgRemoteClient.ERemoteClientBroadcastMsg.k_ERemoteClientBroadcastMsgDiscovery;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastHeader_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader build() {
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader result = new SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.clientId_ = clientId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.msgType_ = msgType_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader.getDefaultInstance()) return this;
                if (other.hasClientId()) {
                    setClientId(other.getClientId());
                }
                if (other.hasMsgType()) {
                    setMsgType(other.getMsgType());
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
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientBroadcastHeader) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint64 client_id = 1;
            private long clientId_ ;
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public boolean hasClientId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public long getClientId() {
                return clientId_;
            }
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public Builder setClientId(long value) {
                bitField0_ |= 0x00000001;
                clientId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public Builder clearClientId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                clientId_ = 0L;
                onChanged();
                return this;
            }
            // optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];
            private SteamMsgRemoteClient.ERemoteClientBroadcastMsg msgType_ = SteamMsgRemoteClient.ERemoteClientBroadcastMsg.k_ERemoteClientBroadcastMsgDiscovery;
            /**
             * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
             */
            public boolean hasMsgType() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
             */
            public SteamMsgRemoteClient.ERemoteClientBroadcastMsg getMsgType() {
                return msgType_;
            }
            /**
             * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
             */
            public Builder setMsgType(SteamMsgRemoteClient.ERemoteClientBroadcastMsg value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                msgType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .ERemoteClientBroadcastMsg msg_type = 2 [default = k_ERemoteClientBroadcastMsgDiscovery];</code>
             */
            public Builder clearMsgType() {
                bitField0_ = (bitField0_ & ~0x00000002);
                msgType_ = SteamMsgRemoteClient.ERemoteClientBroadcastMsg.k_ERemoteClientBroadcastMsgDiscovery;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientBroadcastHeader)
        }
        static {
            defaultInstance = new CMsgRemoteClientBroadcastHeader(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientBroadcastHeader)
    }
    public interface CMsgRemoteClientBroadcastStatusOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional int32 version = 1;
        /**
         * <code>optional int32 version = 1;</code>
         */
        boolean hasVersion();
        /**
         * <code>optional int32 version = 1;</code>
         */
        int getVersion();
// optional int32 min_version = 2;
        /**
         * <code>optional int32 min_version = 2;</code>
         */
        boolean hasMinVersion();
        /**
         * <code>optional int32 min_version = 2;</code>
         */
        int getMinVersion();
// optional uint32 connect_port = 3;
        /**
         * <code>optional uint32 connect_port = 3;</code>
         */
        boolean hasConnectPort();
        /**
         * <code>optional uint32 connect_port = 3;</code>
         */
        int getConnectPort();
// optional string hostname = 4;
        /**
         * <code>optional string hostname = 4;</code>
         */
        boolean hasHostname();
        /**
         * <code>optional string hostname = 4;</code>
         */
        java.lang.String getHostname();
        /**
         * <code>optional string hostname = 4;</code>
         */
        com.google.protobuf.ByteString
        getHostnameBytes();
// optional uint32 enabled_services = 6;
        /**
         * <code>optional uint32 enabled_services = 6;</code>
         */
        boolean hasEnabledServices();
        /**
         * <code>optional uint32 enabled_services = 6;</code>
         */
        int getEnabledServices();
// optional int32 ostype = 7 [default = 0];
        /**
         * <code>optional int32 ostype = 7 [default = 0];</code>
         */
        boolean hasOstype();
        /**
         * <code>optional int32 ostype = 7 [default = 0];</code>
         */
        int getOstype();
// optional bool is64bit = 8 [default = false];
        /**
         * <code>optional bool is64bit = 8 [default = false];</code>
         */
        boolean hasIs64Bit();
        /**
         * <code>optional bool is64bit = 8 [default = false];</code>
         */
        boolean getIs64Bit();
// repeated .CMsgRemoteClientBroadcastStatus.User users = 9;
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        java.util.List<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User>
        getUsersList();
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User getUsers(int index);
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        int getUsersCount();
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        java.util.List<? extends SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder>
        getUsersOrBuilderList();
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder getUsersOrBuilder(
                int index);
// optional uint32 remote_control_port = 10;
        /**
         * <code>optional uint32 remote_control_port = 10;</code>
         */
        boolean hasRemoteControlPort();
        /**
         * <code>optional uint32 remote_control_port = 10;</code>
         */
        int getRemoteControlPort();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientBroadcastStatus}
     */
    public static final class CMsgRemoteClientBroadcastStatus extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientBroadcastStatusOrBuilder {
        // Use CMsgRemoteClientBroadcastStatus.newBuilder() to construct.
        private CMsgRemoteClientBroadcastStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientBroadcastStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientBroadcastStatus defaultInstance;
        public static CMsgRemoteClientBroadcastStatus getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientBroadcastStatus getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientBroadcastStatus(
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
                            version_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            minVersion_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            connectPort_ = input.readUInt32();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            hostname_ = input.readBytes();
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000010;
                            enabledServices_ = input.readUInt32();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000020;
                            ostype_ = input.readInt32();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000040;
                            is64Bit_ = input.readBool();
                            break;
                        }
                        case 74: {
                            if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                                users_ = new java.util.ArrayList<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User>();
                                mutable_bitField0_ |= 0x00000080;
                            }
                            users_.add(input.readMessage(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.PARSER, extensionRegistry));
                            break;
                        }
                        case 80: {
                            bitField0_ |= 0x00000080;
                            remoteControlPort_ = input.readUInt32();
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
                if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                    users_ = java.util.Collections.unmodifiableList(users_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientBroadcastStatus> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientBroadcastStatus>() {
                    public CMsgRemoteClientBroadcastStatus parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientBroadcastStatus(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientBroadcastStatus> getParserForType() {
            return PARSER;
        }
        public interface UserOrBuilder
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
// optional uint32 auth_key_id = 2;
            /**
             * <code>optional uint32 auth_key_id = 2;</code>
             */
            boolean hasAuthKeyId();
            /**
             * <code>optional uint32 auth_key_id = 2;</code>
             */
            int getAuthKeyId();
        }
        /**
         * Protobuf type {@code CMsgRemoteClientBroadcastStatus.User}
         */
        public static final class User extends
                com.google.protobuf.GeneratedMessage
                implements UserOrBuilder {
            // Use User.newBuilder() to construct.
            private User(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private User(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
            private static final User defaultInstance;
            public static User getDefaultInstance() {
                return defaultInstance;
            }
            public User getDefaultInstanceForType() {
                return defaultInstance;
            }
            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private User(
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
                                authKeyId_ = input.readUInt32();
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
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_User_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_User_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder.class);
            }
            public static com.google.protobuf.Parser<User> PARSER =
                    new com.google.protobuf.AbstractParser<User>() {
                        public User parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new User(input, extensionRegistry);
                        }
                    };
            @java.lang.Override
            public com.google.protobuf.Parser<User> getParserForType() {
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
            // optional uint32 auth_key_id = 2;
            public static final int AUTH_KEY_ID_FIELD_NUMBER = 2;
            private int authKeyId_;
            /**
             * <code>optional uint32 auth_key_id = 2;</code>
             */
            public boolean hasAuthKeyId() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint32 auth_key_id = 2;</code>
             */
            public int getAuthKeyId() {
                return authKeyId_;
            }
            private void initFields() {
                steamid_ = 0L;
                authKeyId_ = 0;
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
                    output.writeUInt32(2, authKeyId_);
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
                            .computeUInt32Size(2, authKeyId_);
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
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User prototype) {
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
             * Protobuf type {@code CMsgRemoteClientBroadcastStatus.User}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_User_descriptor;
                }
                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_User_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder.class);
                }
                // Construct using SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.newBuilder()
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
                    authKeyId_ = 0;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_User_descriptor;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User getDefaultInstanceForType() {
                    return SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.getDefaultInstance();
                }
                public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User build() {
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User buildPartial() {
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User result = new SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.steamid_ = steamid_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.authKeyId_ = authKeyId_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User) {
                        return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }
                public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User other) {
                    if (other == SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.getDefaultInstance()) return this;
                    if (other.hasSteamid()) {
                        setSteamid(other.getSteamid());
                    }
                    if (other.hasAuthKeyId()) {
                        setAuthKeyId(other.getAuthKeyId());
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
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User) e.getUnfinishedMessage();
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
                // optional uint32 auth_key_id = 2;
                private int authKeyId_ ;
                /**
                 * <code>optional uint32 auth_key_id = 2;</code>
                 */
                public boolean hasAuthKeyId() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional uint32 auth_key_id = 2;</code>
                 */
                public int getAuthKeyId() {
                    return authKeyId_;
                }
                /**
                 * <code>optional uint32 auth_key_id = 2;</code>
                 */
                public Builder setAuthKeyId(int value) {
                    bitField0_ |= 0x00000002;
                    authKeyId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint32 auth_key_id = 2;</code>
                 */
                public Builder clearAuthKeyId() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    authKeyId_ = 0;
                    onChanged();
                    return this;
                }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientBroadcastStatus.User)
            }
            static {
                defaultInstance = new User(true);
                defaultInstance.initFields();
            }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientBroadcastStatus.User)
        }
        private int bitField0_;
        // optional int32 version = 1;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int version_;
        /**
         * <code>optional int32 version = 1;</code>
         */
        public boolean hasVersion() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional int32 version = 1;</code>
         */
        public int getVersion() {
            return version_;
        }
        // optional int32 min_version = 2;
        public static final int MIN_VERSION_FIELD_NUMBER = 2;
        private int minVersion_;
        /**
         * <code>optional int32 min_version = 2;</code>
         */
        public boolean hasMinVersion() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int32 min_version = 2;</code>
         */
        public int getMinVersion() {
            return minVersion_;
        }
        // optional uint32 connect_port = 3;
        public static final int CONNECT_PORT_FIELD_NUMBER = 3;
        private int connectPort_;
        /**
         * <code>optional uint32 connect_port = 3;</code>
         */
        public boolean hasConnectPort() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint32 connect_port = 3;</code>
         */
        public int getConnectPort() {
            return connectPort_;
        }
        // optional string hostname = 4;
        public static final int HOSTNAME_FIELD_NUMBER = 4;
        private java.lang.Object hostname_;
        /**
         * <code>optional string hostname = 4;</code>
         */
        public boolean hasHostname() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string hostname = 4;</code>
         */
        public java.lang.String getHostname() {
            java.lang.Object ref = hostname_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    hostname_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string hostname = 4;</code>
         */
        public com.google.protobuf.ByteString
        getHostnameBytes() {
            java.lang.Object ref = hostname_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                hostname_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional uint32 enabled_services = 6;
        public static final int ENABLED_SERVICES_FIELD_NUMBER = 6;
        private int enabledServices_;
        /**
         * <code>optional uint32 enabled_services = 6;</code>
         */
        public boolean hasEnabledServices() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint32 enabled_services = 6;</code>
         */
        public int getEnabledServices() {
            return enabledServices_;
        }
        // optional int32 ostype = 7 [default = 0];
        public static final int OSTYPE_FIELD_NUMBER = 7;
        private int ostype_;
        /**
         * <code>optional int32 ostype = 7 [default = 0];</code>
         */
        public boolean hasOstype() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional int32 ostype = 7 [default = 0];</code>
         */
        public int getOstype() {
            return ostype_;
        }
        // optional bool is64bit = 8 [default = false];
        public static final int IS64BIT_FIELD_NUMBER = 8;
        private boolean is64Bit_;
        /**
         * <code>optional bool is64bit = 8 [default = false];</code>
         */
        public boolean hasIs64Bit() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional bool is64bit = 8 [default = false];</code>
         */
        public boolean getIs64Bit() {
            return is64Bit_;
        }
        // repeated .CMsgRemoteClientBroadcastStatus.User users = 9;
        public static final int USERS_FIELD_NUMBER = 9;
        private java.util.List<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User> users_;
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        public java.util.List<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User> getUsersList() {
            return users_;
        }
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        public java.util.List<? extends SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder>
        getUsersOrBuilderList() {
            return users_;
        }
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        public int getUsersCount() {
            return users_.size();
        }
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User getUsers(int index) {
            return users_.get(index);
        }
        /**
         * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
         */
        public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder getUsersOrBuilder(
                int index) {
            return users_.get(index);
        }
        // optional uint32 remote_control_port = 10;
        public static final int REMOTE_CONTROL_PORT_FIELD_NUMBER = 10;
        private int remoteControlPort_;
        /**
         * <code>optional uint32 remote_control_port = 10;</code>
         */
        public boolean hasRemoteControlPort() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional uint32 remote_control_port = 10;</code>
         */
        public int getRemoteControlPort() {
            return remoteControlPort_;
        }
        private void initFields() {
            version_ = 0;
            minVersion_ = 0;
            connectPort_ = 0;
            hostname_ = "";
            enabledServices_ = 0;
            ostype_ = 0;
            is64Bit_ = false;
            users_ = java.util.Collections.emptyList();
            remoteControlPort_ = 0;
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
                output.writeInt32(1, version_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, minVersion_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt32(3, connectPort_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getHostnameBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeUInt32(6, enabledServices_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeInt32(7, ostype_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeBool(8, is64Bit_);
            }
            for (int i = 0; i < users_.size(); i++) {
                output.writeMessage(9, users_.get(i));
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeUInt32(10, remoteControlPort_);
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
                        .computeInt32Size(1, version_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, minVersion_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, connectPort_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getHostnameBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(6, enabledServices_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(7, ostype_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(8, is64Bit_);
            }
            for (int i = 0; i < users_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(9, users_.get(i));
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(10, remoteControlPort_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus prototype) {
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
         * Protobuf type {@code CMsgRemoteClientBroadcastStatus}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.newBuilder()
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
                    getUsersFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                version_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                minVersion_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                connectPort_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                hostname_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                enabledServices_ = 0;
                bitField0_ = (bitField0_ & ~0x00000010);
                ostype_ = 0;
                bitField0_ = (bitField0_ & ~0x00000020);
                is64Bit_ = false;
                bitField0_ = (bitField0_ & ~0x00000040);
                if (usersBuilder_ == null) {
                    users_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                } else {
                    usersBuilder_.clear();
                }
                remoteControlPort_ = 0;
                bitField0_ = (bitField0_ & ~0x00000100);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastStatus_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus build() {
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus result = new SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.version_ = version_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.minVersion_ = minVersion_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.connectPort_ = connectPort_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.hostname_ = hostname_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.enabledServices_ = enabledServices_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.ostype_ = ostype_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.is64Bit_ = is64Bit_;
                if (usersBuilder_ == null) {
                    if (((bitField0_ & 0x00000080) == 0x00000080)) {
                        users_ = java.util.Collections.unmodifiableList(users_);
                        bitField0_ = (bitField0_ & ~0x00000080);
                    }
                    result.users_ = users_;
                } else {
                    result.users_ = usersBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.remoteControlPort_ = remoteControlPort_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance()) return this;
                if (other.hasVersion()) {
                    setVersion(other.getVersion());
                }
                if (other.hasMinVersion()) {
                    setMinVersion(other.getMinVersion());
                }
                if (other.hasConnectPort()) {
                    setConnectPort(other.getConnectPort());
                }
                if (other.hasHostname()) {
                    bitField0_ |= 0x00000008;
                    hostname_ = other.hostname_;
                    onChanged();
                }
                if (other.hasEnabledServices()) {
                    setEnabledServices(other.getEnabledServices());
                }
                if (other.hasOstype()) {
                    setOstype(other.getOstype());
                }
                if (other.hasIs64Bit()) {
                    setIs64Bit(other.getIs64Bit());
                }
                if (usersBuilder_ == null) {
                    if (!other.users_.isEmpty()) {
                        if (users_.isEmpty()) {
                            users_ = other.users_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                        } else {
                            ensureUsersIsMutable();
                            users_.addAll(other.users_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.users_.isEmpty()) {
                        if (usersBuilder_.isEmpty()) {
                            usersBuilder_.dispose();
                            usersBuilder_ = null;
                            users_ = other.users_;
                            bitField0_ = (bitField0_ & ~0x00000080);
                            usersBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getUsersFieldBuilder() : null;
                        } else {
                            usersBuilder_.addAllMessages(other.users_);
                        }
                    }
                }
                if (other.hasRemoteControlPort()) {
                    setRemoteControlPort(other.getRemoteControlPort());
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
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional int32 version = 1;
            private int version_ ;
            /**
             * <code>optional int32 version = 1;</code>
             */
            public boolean hasVersion() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional int32 version = 1;</code>
             */
            public int getVersion() {
                return version_;
            }
            /**
             * <code>optional int32 version = 1;</code>
             */
            public Builder setVersion(int value) {
                bitField0_ |= 0x00000001;
                version_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 version = 1;</code>
             */
            public Builder clearVersion() {
                bitField0_ = (bitField0_ & ~0x00000001);
                version_ = 0;
                onChanged();
                return this;
            }
            // optional int32 min_version = 2;
            private int minVersion_ ;
            /**
             * <code>optional int32 min_version = 2;</code>
             */
            public boolean hasMinVersion() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional int32 min_version = 2;</code>
             */
            public int getMinVersion() {
                return minVersion_;
            }
            /**
             * <code>optional int32 min_version = 2;</code>
             */
            public Builder setMinVersion(int value) {
                bitField0_ |= 0x00000002;
                minVersion_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 min_version = 2;</code>
             */
            public Builder clearMinVersion() {
                bitField0_ = (bitField0_ & ~0x00000002);
                minVersion_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 connect_port = 3;
            private int connectPort_ ;
            /**
             * <code>optional uint32 connect_port = 3;</code>
             */
            public boolean hasConnectPort() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint32 connect_port = 3;</code>
             */
            public int getConnectPort() {
                return connectPort_;
            }
            /**
             * <code>optional uint32 connect_port = 3;</code>
             */
            public Builder setConnectPort(int value) {
                bitField0_ |= 0x00000004;
                connectPort_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 connect_port = 3;</code>
             */
            public Builder clearConnectPort() {
                bitField0_ = (bitField0_ & ~0x00000004);
                connectPort_ = 0;
                onChanged();
                return this;
            }
            // optional string hostname = 4;
            private java.lang.Object hostname_ = "";
            /**
             * <code>optional string hostname = 4;</code>
             */
            public boolean hasHostname() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional string hostname = 4;</code>
             */
            public java.lang.String getHostname() {
                java.lang.Object ref = hostname_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    hostname_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string hostname = 4;</code>
             */
            public com.google.protobuf.ByteString
            getHostnameBytes() {
                java.lang.Object ref = hostname_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    hostname_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string hostname = 4;</code>
             */
            public Builder setHostname(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                hostname_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string hostname = 4;</code>
             */
            public Builder clearHostname() {
                bitField0_ = (bitField0_ & ~0x00000008);
                hostname_ = getDefaultInstance().getHostname();
                onChanged();
                return this;
            }
            /**
             * <code>optional string hostname = 4;</code>
             */
            public Builder setHostnameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                hostname_ = value;
                onChanged();
                return this;
            }
            // optional uint32 enabled_services = 6;
            private int enabledServices_ ;
            /**
             * <code>optional uint32 enabled_services = 6;</code>
             */
            public boolean hasEnabledServices() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional uint32 enabled_services = 6;</code>
             */
            public int getEnabledServices() {
                return enabledServices_;
            }
            /**
             * <code>optional uint32 enabled_services = 6;</code>
             */
            public Builder setEnabledServices(int value) {
                bitField0_ |= 0x00000010;
                enabledServices_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 enabled_services = 6;</code>
             */
            public Builder clearEnabledServices() {
                bitField0_ = (bitField0_ & ~0x00000010);
                enabledServices_ = 0;
                onChanged();
                return this;
            }
            // optional int32 ostype = 7 [default = 0];
            private int ostype_ ;
            /**
             * <code>optional int32 ostype = 7 [default = 0];</code>
             */
            public boolean hasOstype() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional int32 ostype = 7 [default = 0];</code>
             */
            public int getOstype() {
                return ostype_;
            }
            /**
             * <code>optional int32 ostype = 7 [default = 0];</code>
             */
            public Builder setOstype(int value) {
                bitField0_ |= 0x00000020;
                ostype_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 ostype = 7 [default = 0];</code>
             */
            public Builder clearOstype() {
                bitField0_ = (bitField0_ & ~0x00000020);
                ostype_ = 0;
                onChanged();
                return this;
            }
            // optional bool is64bit = 8 [default = false];
            private boolean is64Bit_ ;
            /**
             * <code>optional bool is64bit = 8 [default = false];</code>
             */
            public boolean hasIs64Bit() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional bool is64bit = 8 [default = false];</code>
             */
            public boolean getIs64Bit() {
                return is64Bit_;
            }
            /**
             * <code>optional bool is64bit = 8 [default = false];</code>
             */
            public Builder setIs64Bit(boolean value) {
                bitField0_ |= 0x00000040;
                is64Bit_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool is64bit = 8 [default = false];</code>
             */
            public Builder clearIs64Bit() {
                bitField0_ = (bitField0_ & ~0x00000040);
                is64Bit_ = false;
                onChanged();
                return this;
            }
            // repeated .CMsgRemoteClientBroadcastStatus.User users = 9;
            private java.util.List<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User> users_ =
                    java.util.Collections.emptyList();
            private void ensureUsersIsMutable() {
                if (!((bitField0_ & 0x00000080) == 0x00000080)) {
                    users_ = new java.util.ArrayList<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User>(users_);
                    bitField0_ |= 0x00000080;
                }
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder> usersBuilder_;
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public java.util.List<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User> getUsersList() {
                if (usersBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(users_);
                } else {
                    return usersBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public int getUsersCount() {
                if (usersBuilder_ == null) {
                    return users_.size();
                } else {
                    return usersBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User getUsers(int index) {
                if (usersBuilder_ == null) {
                    return users_.get(index);
                } else {
                    return usersBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder setUsers(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User value) {
                if (usersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureUsersIsMutable();
                    users_.set(index, value);
                    onChanged();
                } else {
                    usersBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder setUsers(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder builderForValue) {
                if (usersBuilder_ == null) {
                    ensureUsersIsMutable();
                    users_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    usersBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder addUsers(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User value) {
                if (usersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureUsersIsMutable();
                    users_.add(value);
                    onChanged();
                } else {
                    usersBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder addUsers(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User value) {
                if (usersBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureUsersIsMutable();
                    users_.add(index, value);
                    onChanged();
                } else {
                    usersBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder addUsers(
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder builderForValue) {
                if (usersBuilder_ == null) {
                    ensureUsersIsMutable();
                    users_.add(builderForValue.build());
                    onChanged();
                } else {
                    usersBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder addUsers(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder builderForValue) {
                if (usersBuilder_ == null) {
                    ensureUsersIsMutable();
                    users_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    usersBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder addAllUsers(
                    java.lang.Iterable<? extends SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User> values) {
                if (usersBuilder_ == null) {
                    ensureUsersIsMutable();
                    super.addAll(values, users_);
                    onChanged();
                } else {
                    usersBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder clearUsers() {
                if (usersBuilder_ == null) {
                    users_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000080);
                    onChanged();
                } else {
                    usersBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public Builder removeUsers(int index) {
                if (usersBuilder_ == null) {
                    ensureUsersIsMutable();
                    users_.remove(index);
                    onChanged();
                } else {
                    usersBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder getUsersBuilder(
                    int index) {
                return getUsersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder getUsersOrBuilder(
                    int index) {
                if (usersBuilder_ == null) {
                    return users_.get(index); } else {
                    return usersBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public java.util.List<? extends SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder>
            getUsersOrBuilderList() {
                if (usersBuilder_ != null) {
                    return usersBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(users_);
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder addUsersBuilder() {
                return getUsersFieldBuilder().addBuilder(
                        SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.getDefaultInstance());
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder addUsersBuilder(
                    int index) {
                return getUsersFieldBuilder().addBuilder(
                        index, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.getDefaultInstance());
            }
            /**
             * <code>repeated .CMsgRemoteClientBroadcastStatus.User users = 9;</code>
             */
            public java.util.List<SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder>
            getUsersBuilderList() {
                return getUsersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder>
            getUsersFieldBuilder() {
                if (usersBuilder_ == null) {
                    usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.User.Builder, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.UserOrBuilder>(
                            users_,
                            ((bitField0_ & 0x00000080) == 0x00000080),
                            getParentForChildren(),
                            isClean());
                    users_ = null;
                }
                return usersBuilder_;
            }
            // optional uint32 remote_control_port = 10;
            private int remoteControlPort_ ;
            /**
             * <code>optional uint32 remote_control_port = 10;</code>
             */
            public boolean hasRemoteControlPort() {
                return ((bitField0_ & 0x00000100) == 0x00000100);
            }
            /**
             * <code>optional uint32 remote_control_port = 10;</code>
             */
            public int getRemoteControlPort() {
                return remoteControlPort_;
            }
            /**
             * <code>optional uint32 remote_control_port = 10;</code>
             */
            public Builder setRemoteControlPort(int value) {
                bitField0_ |= 0x00000100;
                remoteControlPort_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 remote_control_port = 10;</code>
             */
            public Builder clearRemoteControlPort() {
                bitField0_ = (bitField0_ & ~0x00000100);
                remoteControlPort_ = 0;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientBroadcastStatus)
        }
        static {
            defaultInstance = new CMsgRemoteClientBroadcastStatus(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientBroadcastStatus)
    }
    public interface CMsgRemoteClientBroadcastDiscoveryOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint32 seq_num = 1;
        /**
         * <code>optional uint32 seq_num = 1;</code>
         */
        boolean hasSeqNum();
        /**
         * <code>optional uint32 seq_num = 1;</code>
         */
        int getSeqNum();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientBroadcastDiscovery}
     */
    public static final class CMsgRemoteClientBroadcastDiscovery extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientBroadcastDiscoveryOrBuilder {
        // Use CMsgRemoteClientBroadcastDiscovery.newBuilder() to construct.
        private CMsgRemoteClientBroadcastDiscovery(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientBroadcastDiscovery(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientBroadcastDiscovery defaultInstance;
        public static CMsgRemoteClientBroadcastDiscovery getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientBroadcastDiscovery getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientBroadcastDiscovery(
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
                            seqNum_ = input.readUInt32();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastDiscovery_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastDiscovery_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientBroadcastDiscovery> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientBroadcastDiscovery>() {
                    public CMsgRemoteClientBroadcastDiscovery parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientBroadcastDiscovery(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientBroadcastDiscovery> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint32 seq_num = 1;
        public static final int SEQ_NUM_FIELD_NUMBER = 1;
        private int seqNum_;
        /**
         * <code>optional uint32 seq_num = 1;</code>
         */
        public boolean hasSeqNum() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 seq_num = 1;</code>
         */
        public int getSeqNum() {
            return seqNum_;
        }
        private void initFields() {
            seqNum_ = 0;
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
                output.writeUInt32(1, seqNum_);
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
                        .computeUInt32Size(1, seqNum_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery prototype) {
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
         * Protobuf type {@code CMsgRemoteClientBroadcastDiscovery}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscoveryOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastDiscovery_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastDiscovery_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.class, SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.newBuilder()
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
                seqNum_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientBroadcastDiscovery_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery build() {
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery result = new SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.seqNum_ = seqNum_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery.getDefaultInstance()) return this;
                if (other.hasSeqNum()) {
                    setSeqNum(other.getSeqNum());
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
                SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientBroadcastDiscovery) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint32 seq_num = 1;
            private int seqNum_ ;
            /**
             * <code>optional uint32 seq_num = 1;</code>
             */
            public boolean hasSeqNum() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 seq_num = 1;</code>
             */
            public int getSeqNum() {
                return seqNum_;
            }
            /**
             * <code>optional uint32 seq_num = 1;</code>
             */
            public Builder setSeqNum(int value) {
                bitField0_ |= 0x00000001;
                seqNum_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 seq_num = 1;</code>
             */
            public Builder clearSeqNum() {
                bitField0_ = (bitField0_ & ~0x00000001);
                seqNum_ = 0;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientBroadcastDiscovery)
        }
        static {
            defaultInstance = new CMsgRemoteClientBroadcastDiscovery(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientBroadcastDiscovery)
    }
    public interface CMsgRemoteClientAppStatusOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        java.util.List<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus>
        getStatusUpdatesList();
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus getStatusUpdates(int index);
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        int getStatusUpdatesCount();
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        java.util.List<? extends SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder>
        getStatusUpdatesOrBuilderList();
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder getStatusUpdatesOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code CMsgRemoteClientAppStatus}
     */
    public static final class CMsgRemoteClientAppStatus extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientAppStatusOrBuilder {
        // Use CMsgRemoteClientAppStatus.newBuilder() to construct.
        private CMsgRemoteClientAppStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientAppStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientAppStatus defaultInstance;
        public static CMsgRemoteClientAppStatus getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientAppStatus getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientAppStatus(
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
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                statusUpdates_ = new java.util.ArrayList<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            statusUpdates_.add(input.readMessage(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.PARSER, extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    statusUpdates_ = java.util.Collections.unmodifiableList(statusUpdates_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientAppStatus.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientAppStatus> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientAppStatus>() {
                    public CMsgRemoteClientAppStatus parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientAppStatus(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientAppStatus> getParserForType() {
            return PARSER;
        }
        public interface AppUpdateInfoOrBuilder
                extends com.google.protobuf.MessageOrBuilder {
// optional fixed32 time_update_start = 1;
            /**
             * <code>optional fixed32 time_update_start = 1;</code>
             */
            boolean hasTimeUpdateStart();
            /**
             * <code>optional fixed32 time_update_start = 1;</code>
             */
            int getTimeUpdateStart();
// optional uint64 bytes_to_download = 2;
            /**
             * <code>optional uint64 bytes_to_download = 2;</code>
             */
            boolean hasBytesToDownload();
            /**
             * <code>optional uint64 bytes_to_download = 2;</code>
             */
            long getBytesToDownload();
// optional uint64 bytes_downloaded = 3;
            /**
             * <code>optional uint64 bytes_downloaded = 3;</code>
             */
            boolean hasBytesDownloaded();
            /**
             * <code>optional uint64 bytes_downloaded = 3;</code>
             */
            long getBytesDownloaded();
// optional uint64 bytes_to_process = 4;
            /**
             * <code>optional uint64 bytes_to_process = 4;</code>
             */
            boolean hasBytesToProcess();
            /**
             * <code>optional uint64 bytes_to_process = 4;</code>
             */
            long getBytesToProcess();
// optional uint64 bytes_processed = 5;
            /**
             * <code>optional uint64 bytes_processed = 5;</code>
             */
            boolean hasBytesProcessed();
            /**
             * <code>optional uint64 bytes_processed = 5;</code>
             */
            long getBytesProcessed();
// optional int32 estimated_seconds_remaining = 6 [default = -1];
            /**
             * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
             */
            boolean hasEstimatedSecondsRemaining();
            /**
             * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
             */
            int getEstimatedSecondsRemaining();
// optional int32 update_result = 7;
            /**
             * <code>optional int32 update_result = 7;</code>
             */
            boolean hasUpdateResult();
            /**
             * <code>optional int32 update_result = 7;</code>
             */
            int getUpdateResult();
        }
        /**
         * Protobuf type {@code CMsgRemoteClientAppStatus.AppUpdateInfo}
         */
        public static final class AppUpdateInfo extends
                com.google.protobuf.GeneratedMessage
                implements AppUpdateInfoOrBuilder {
            // Use AppUpdateInfo.newBuilder() to construct.
            private AppUpdateInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private AppUpdateInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
            private static final AppUpdateInfo defaultInstance;
            public static AppUpdateInfo getDefaultInstance() {
                return defaultInstance;
            }
            public AppUpdateInfo getDefaultInstanceForType() {
                return defaultInstance;
            }
            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private AppUpdateInfo(
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
                            case 13: {
                                bitField0_ |= 0x00000001;
                                timeUpdateStart_ = input.readFixed32();
                                break;
                            }
                            case 16: {
                                bitField0_ |= 0x00000002;
                                bytesToDownload_ = input.readUInt64();
                                break;
                            }
                            case 24: {
                                bitField0_ |= 0x00000004;
                                bytesDownloaded_ = input.readUInt64();
                                break;
                            }
                            case 32: {
                                bitField0_ |= 0x00000008;
                                bytesToProcess_ = input.readUInt64();
                                break;
                            }
                            case 40: {
                                bitField0_ |= 0x00000010;
                                bytesProcessed_ = input.readUInt64();
                                break;
                            }
                            case 48: {
                                bitField0_ |= 0x00000020;
                                estimatedSecondsRemaining_ = input.readInt32();
                                break;
                            }
                            case 56: {
                                bitField0_ |= 0x00000040;
                                updateResult_ = input.readInt32();
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
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder.class);
            }
            public static com.google.protobuf.Parser<AppUpdateInfo> PARSER =
                    new com.google.protobuf.AbstractParser<AppUpdateInfo>() {
                        public AppUpdateInfo parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new AppUpdateInfo(input, extensionRegistry);
                        }
                    };
            @java.lang.Override
            public com.google.protobuf.Parser<AppUpdateInfo> getParserForType() {
                return PARSER;
            }
            private int bitField0_;
            // optional fixed32 time_update_start = 1;
            public static final int TIME_UPDATE_START_FIELD_NUMBER = 1;
            private int timeUpdateStart_;
            /**
             * <code>optional fixed32 time_update_start = 1;</code>
             */
            public boolean hasTimeUpdateStart() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional fixed32 time_update_start = 1;</code>
             */
            public int getTimeUpdateStart() {
                return timeUpdateStart_;
            }
            // optional uint64 bytes_to_download = 2;
            public static final int BYTES_TO_DOWNLOAD_FIELD_NUMBER = 2;
            private long bytesToDownload_;
            /**
             * <code>optional uint64 bytes_to_download = 2;</code>
             */
            public boolean hasBytesToDownload() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 bytes_to_download = 2;</code>
             */
            public long getBytesToDownload() {
                return bytesToDownload_;
            }
            // optional uint64 bytes_downloaded = 3;
            public static final int BYTES_DOWNLOADED_FIELD_NUMBER = 3;
            private long bytesDownloaded_;
            /**
             * <code>optional uint64 bytes_downloaded = 3;</code>
             */
            public boolean hasBytesDownloaded() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint64 bytes_downloaded = 3;</code>
             */
            public long getBytesDownloaded() {
                return bytesDownloaded_;
            }
            // optional uint64 bytes_to_process = 4;
            public static final int BYTES_TO_PROCESS_FIELD_NUMBER = 4;
            private long bytesToProcess_;
            /**
             * <code>optional uint64 bytes_to_process = 4;</code>
             */
            public boolean hasBytesToProcess() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional uint64 bytes_to_process = 4;</code>
             */
            public long getBytesToProcess() {
                return bytesToProcess_;
            }
            // optional uint64 bytes_processed = 5;
            public static final int BYTES_PROCESSED_FIELD_NUMBER = 5;
            private long bytesProcessed_;
            /**
             * <code>optional uint64 bytes_processed = 5;</code>
             */
            public boolean hasBytesProcessed() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional uint64 bytes_processed = 5;</code>
             */
            public long getBytesProcessed() {
                return bytesProcessed_;
            }
            // optional int32 estimated_seconds_remaining = 6 [default = -1];
            public static final int ESTIMATED_SECONDS_REMAINING_FIELD_NUMBER = 6;
            private int estimatedSecondsRemaining_;
            /**
             * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
             */
            public boolean hasEstimatedSecondsRemaining() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
             */
            public int getEstimatedSecondsRemaining() {
                return estimatedSecondsRemaining_;
            }
            // optional int32 update_result = 7;
            public static final int UPDATE_RESULT_FIELD_NUMBER = 7;
            private int updateResult_;
            /**
             * <code>optional int32 update_result = 7;</code>
             */
            public boolean hasUpdateResult() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional int32 update_result = 7;</code>
             */
            public int getUpdateResult() {
                return updateResult_;
            }
            private void initFields() {
                timeUpdateStart_ = 0;
                bytesToDownload_ = 0L;
                bytesDownloaded_ = 0L;
                bytesToProcess_ = 0L;
                bytesProcessed_ = 0L;
                estimatedSecondsRemaining_ = -1;
                updateResult_ = 0;
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
                    output.writeFixed32(1, timeUpdateStart_);
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeUInt64(2, bytesToDownload_);
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeUInt64(3, bytesDownloaded_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    output.writeUInt64(4, bytesToProcess_);
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    output.writeUInt64(5, bytesProcessed_);
                }
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    output.writeInt32(6, estimatedSecondsRemaining_);
                }
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                    output.writeInt32(7, updateResult_);
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
                            .computeFixed32Size(1, timeUpdateStart_);
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt64Size(2, bytesToDownload_);
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt64Size(3, bytesDownloaded_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt64Size(4, bytesToProcess_);
                }
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt64Size(5, bytesProcessed_);
                }
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(6, estimatedSecondsRemaining_);
                }
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeInt32Size(7, updateResult_);
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
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo prototype) {
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
             * Protobuf type {@code CMsgRemoteClientAppStatus.AppUpdateInfo}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_descriptor;
                }
                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder.class);
                }
                // Construct using SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.newBuilder()
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
                    timeUpdateStart_ = 0;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    bytesToDownload_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    bytesDownloaded_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    bytesToProcess_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000008);
                    bytesProcessed_ = 0L;
                    bitField0_ = (bitField0_ & ~0x00000010);
                    estimatedSecondsRemaining_ = -1;
                    bitField0_ = (bitField0_ & ~0x00000020);
                    updateResult_ = 0;
                    bitField0_ = (bitField0_ & ~0x00000040);
                    return this;
                }
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_descriptor;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo getDefaultInstanceForType() {
                    return SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance();
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo build() {
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo buildPartial() {
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo result = new SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.timeUpdateStart_ = timeUpdateStart_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.bytesToDownload_ = bytesToDownload_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    result.bytesDownloaded_ = bytesDownloaded_;
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    result.bytesToProcess_ = bytesToProcess_;
                    if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                        to_bitField0_ |= 0x00000010;
                    }
                    result.bytesProcessed_ = bytesProcessed_;
                    if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                        to_bitField0_ |= 0x00000020;
                    }
                    result.estimatedSecondsRemaining_ = estimatedSecondsRemaining_;
                    if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                        to_bitField0_ |= 0x00000040;
                    }
                    result.updateResult_ = updateResult_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo) {
                        return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }
                public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo other) {
                    if (other == SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance()) return this;
                    if (other.hasTimeUpdateStart()) {
                        setTimeUpdateStart(other.getTimeUpdateStart());
                    }
                    if (other.hasBytesToDownload()) {
                        setBytesToDownload(other.getBytesToDownload());
                    }
                    if (other.hasBytesDownloaded()) {
                        setBytesDownloaded(other.getBytesDownloaded());
                    }
                    if (other.hasBytesToProcess()) {
                        setBytesToProcess(other.getBytesToProcess());
                    }
                    if (other.hasBytesProcessed()) {
                        setBytesProcessed(other.getBytesProcessed());
                    }
                    if (other.hasEstimatedSecondsRemaining()) {
                        setEstimatedSecondsRemaining(other.getEstimatedSecondsRemaining());
                    }
                    if (other.hasUpdateResult()) {
                        setUpdateResult(other.getUpdateResult());
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
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;
                // optional fixed32 time_update_start = 1;
                private int timeUpdateStart_ ;
                /**
                 * <code>optional fixed32 time_update_start = 1;</code>
                 */
                public boolean hasTimeUpdateStart() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>optional fixed32 time_update_start = 1;</code>
                 */
                public int getTimeUpdateStart() {
                    return timeUpdateStart_;
                }
                /**
                 * <code>optional fixed32 time_update_start = 1;</code>
                 */
                public Builder setTimeUpdateStart(int value) {
                    bitField0_ |= 0x00000001;
                    timeUpdateStart_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional fixed32 time_update_start = 1;</code>
                 */
                public Builder clearTimeUpdateStart() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    timeUpdateStart_ = 0;
                    onChanged();
                    return this;
                }
                // optional uint64 bytes_to_download = 2;
                private long bytesToDownload_ ;
                /**
                 * <code>optional uint64 bytes_to_download = 2;</code>
                 */
                public boolean hasBytesToDownload() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional uint64 bytes_to_download = 2;</code>
                 */
                public long getBytesToDownload() {
                    return bytesToDownload_;
                }
                /**
                 * <code>optional uint64 bytes_to_download = 2;</code>
                 */
                public Builder setBytesToDownload(long value) {
                    bitField0_ |= 0x00000002;
                    bytesToDownload_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint64 bytes_to_download = 2;</code>
                 */
                public Builder clearBytesToDownload() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    bytesToDownload_ = 0L;
                    onChanged();
                    return this;
                }
                // optional uint64 bytes_downloaded = 3;
                private long bytesDownloaded_ ;
                /**
                 * <code>optional uint64 bytes_downloaded = 3;</code>
                 */
                public boolean hasBytesDownloaded() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>optional uint64 bytes_downloaded = 3;</code>
                 */
                public long getBytesDownloaded() {
                    return bytesDownloaded_;
                }
                /**
                 * <code>optional uint64 bytes_downloaded = 3;</code>
                 */
                public Builder setBytesDownloaded(long value) {
                    bitField0_ |= 0x00000004;
                    bytesDownloaded_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint64 bytes_downloaded = 3;</code>
                 */
                public Builder clearBytesDownloaded() {
                    bitField0_ = (bitField0_ & ~0x00000004);
                    bytesDownloaded_ = 0L;
                    onChanged();
                    return this;
                }
                // optional uint64 bytes_to_process = 4;
                private long bytesToProcess_ ;
                /**
                 * <code>optional uint64 bytes_to_process = 4;</code>
                 */
                public boolean hasBytesToProcess() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>optional uint64 bytes_to_process = 4;</code>
                 */
                public long getBytesToProcess() {
                    return bytesToProcess_;
                }
                /**
                 * <code>optional uint64 bytes_to_process = 4;</code>
                 */
                public Builder setBytesToProcess(long value) {
                    bitField0_ |= 0x00000008;
                    bytesToProcess_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint64 bytes_to_process = 4;</code>
                 */
                public Builder clearBytesToProcess() {
                    bitField0_ = (bitField0_ & ~0x00000008);
                    bytesToProcess_ = 0L;
                    onChanged();
                    return this;
                }
                // optional uint64 bytes_processed = 5;
                private long bytesProcessed_ ;
                /**
                 * <code>optional uint64 bytes_processed = 5;</code>
                 */
                public boolean hasBytesProcessed() {
                    return ((bitField0_ & 0x00000010) == 0x00000010);
                }
                /**
                 * <code>optional uint64 bytes_processed = 5;</code>
                 */
                public long getBytesProcessed() {
                    return bytesProcessed_;
                }
                /**
                 * <code>optional uint64 bytes_processed = 5;</code>
                 */
                public Builder setBytesProcessed(long value) {
                    bitField0_ |= 0x00000010;
                    bytesProcessed_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint64 bytes_processed = 5;</code>
                 */
                public Builder clearBytesProcessed() {
                    bitField0_ = (bitField0_ & ~0x00000010);
                    bytesProcessed_ = 0L;
                    onChanged();
                    return this;
                }
                // optional int32 estimated_seconds_remaining = 6 [default = -1];
                private int estimatedSecondsRemaining_ = -1;
                /**
                 * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
                 */
                public boolean hasEstimatedSecondsRemaining() {
                    return ((bitField0_ & 0x00000020) == 0x00000020);
                }
                /**
                 * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
                 */
                public int getEstimatedSecondsRemaining() {
                    return estimatedSecondsRemaining_;
                }
                /**
                 * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
                 */
                public Builder setEstimatedSecondsRemaining(int value) {
                    bitField0_ |= 0x00000020;
                    estimatedSecondsRemaining_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional int32 estimated_seconds_remaining = 6 [default = -1];</code>
                 */
                public Builder clearEstimatedSecondsRemaining() {
                    bitField0_ = (bitField0_ & ~0x00000020);
                    estimatedSecondsRemaining_ = -1;
                    onChanged();
                    return this;
                }
                // optional int32 update_result = 7;
                private int updateResult_ ;
                /**
                 * <code>optional int32 update_result = 7;</code>
                 */
                public boolean hasUpdateResult() {
                    return ((bitField0_ & 0x00000040) == 0x00000040);
                }
                /**
                 * <code>optional int32 update_result = 7;</code>
                 */
                public int getUpdateResult() {
                    return updateResult_;
                }
                /**
                 * <code>optional int32 update_result = 7;</code>
                 */
                public Builder setUpdateResult(int value) {
                    bitField0_ |= 0x00000040;
                    updateResult_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional int32 update_result = 7;</code>
                 */
                public Builder clearUpdateResult() {
                    bitField0_ = (bitField0_ & ~0x00000040);
                    updateResult_ = 0;
                    onChanged();
                    return this;
                }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAppStatus.AppUpdateInfo)
            }
            static {
                defaultInstance = new AppUpdateInfo(true);
                defaultInstance.initFields();
            }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAppStatus.AppUpdateInfo)
        }
        public interface ShortcutInfoOrBuilder
                extends com.google.protobuf.MessageOrBuilder {
// optional string name = 1;
            /**
             * <code>optional string name = 1;</code>
             */
            boolean hasName();
            /**
             * <code>optional string name = 1;</code>
             */
            java.lang.String getName();
            /**
             * <code>optional string name = 1;</code>
             */
            com.google.protobuf.ByteString
            getNameBytes();
// optional string icon = 2;
            /**
             * <code>optional string icon = 2;</code>
             */
            boolean hasIcon();
            /**
             * <code>optional string icon = 2;</code>
             */
            java.lang.String getIcon();
            /**
             * <code>optional string icon = 2;</code>
             */
            com.google.protobuf.ByteString
            getIconBytes();
// repeated string categories = 3;
            /**
             * <code>repeated string categories = 3;</code>
             */
            java.util.List<java.lang.String>
            getCategoriesList();
            /**
             * <code>repeated string categories = 3;</code>
             */
            int getCategoriesCount();
            /**
             * <code>repeated string categories = 3;</code>
             */
            java.lang.String getCategories(int index);
            /**
             * <code>repeated string categories = 3;</code>
             */
            com.google.protobuf.ByteString
            getCategoriesBytes(int index);
        }
        /**
         * Protobuf type {@code CMsgRemoteClientAppStatus.ShortcutInfo}
         */
        public static final class ShortcutInfo extends
                com.google.protobuf.GeneratedMessage
                implements ShortcutInfoOrBuilder {
            // Use ShortcutInfo.newBuilder() to construct.
            private ShortcutInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private ShortcutInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
            private static final ShortcutInfo defaultInstance;
            public static ShortcutInfo getDefaultInstance() {
                return defaultInstance;
            }
            public ShortcutInfo getDefaultInstanceForType() {
                return defaultInstance;
            }
            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private ShortcutInfo(
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
                                name_ = input.readBytes();
                                break;
                            }
                            case 18: {
                                bitField0_ |= 0x00000002;
                                icon_ = input.readBytes();
                                break;
                            }
                            case 26: {
                                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                                    categories_ = new com.google.protobuf.LazyStringArrayList();
                                    mutable_bitField0_ |= 0x00000004;
                                }
                                categories_.add(input.readBytes());
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
                    if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                        categories_ = new com.google.protobuf.UnmodifiableLazyStringList(categories_);
                    }
                    this.unknownFields = unknownFields.build();
                    makeExtensionsImmutable();
                }
            }
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder.class);
            }
            public static com.google.protobuf.Parser<ShortcutInfo> PARSER =
                    new com.google.protobuf.AbstractParser<ShortcutInfo>() {
                        public ShortcutInfo parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new ShortcutInfo(input, extensionRegistry);
                        }
                    };
            @java.lang.Override
            public com.google.protobuf.Parser<ShortcutInfo> getParserForType() {
                return PARSER;
            }
            private int bitField0_;
            // optional string name = 1;
            public static final int NAME_FIELD_NUMBER = 1;
            private java.lang.Object name_;
            /**
             * <code>optional string name = 1;</code>
             */
            public boolean hasName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string name = 1;</code>
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
             * <code>optional string name = 1;</code>
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
            // optional string icon = 2;
            public static final int ICON_FIELD_NUMBER = 2;
            private java.lang.Object icon_;
            /**
             * <code>optional string icon = 2;</code>
             */
            public boolean hasIcon() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string icon = 2;</code>
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
             * <code>optional string icon = 2;</code>
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
            // repeated string categories = 3;
            public static final int CATEGORIES_FIELD_NUMBER = 3;
            private com.google.protobuf.LazyStringList categories_;
            /**
             * <code>repeated string categories = 3;</code>
             */
            public java.util.List<java.lang.String>
            getCategoriesList() {
                return categories_;
            }
            /**
             * <code>repeated string categories = 3;</code>
             */
            public int getCategoriesCount() {
                return categories_.size();
            }
            /**
             * <code>repeated string categories = 3;</code>
             */
            public java.lang.String getCategories(int index) {
                return categories_.get(index);
            }
            /**
             * <code>repeated string categories = 3;</code>
             */
            public com.google.protobuf.ByteString
            getCategoriesBytes(int index) {
                return categories_.getByteString(index);
            }
            private void initFields() {
                name_ = "";
                icon_ = "";
                categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
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
                    output.writeBytes(1, getNameBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeBytes(2, getIconBytes());
                }
                for (int i = 0; i < categories_.size(); i++) {
                    output.writeBytes(3, categories_.getByteString(i));
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
                            .computeBytesSize(1, getNameBytes());
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeBytesSize(2, getIconBytes());
                }
                {
                    int dataSize = 0;
                    for (int i = 0; i < categories_.size(); i++) {
                        dataSize += com.google.protobuf.CodedOutputStream
                                .computeBytesSizeNoTag(categories_.getByteString(i));
                    }
                    size += dataSize;
                    size += 1 * getCategoriesList().size();
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
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo prototype) {
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
             * Protobuf type {@code CMsgRemoteClientAppStatus.ShortcutInfo}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_descriptor;
                }
                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder.class);
                }
                // Construct using SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.newBuilder()
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
                    name_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    icon_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    return this;
                }
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_descriptor;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo getDefaultInstanceForType() {
                    return SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance();
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo build() {
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo buildPartial() {
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo result = new SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.name_ = name_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.icon_ = icon_;
                    if (((bitField0_ & 0x00000004) == 0x00000004)) {
                        categories_ = new com.google.protobuf.UnmodifiableLazyStringList(
                                categories_);
                        bitField0_ = (bitField0_ & ~0x00000004);
                    }
                    result.categories_ = categories_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo) {
                        return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }
                public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo other) {
                    if (other == SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance()) return this;
                    if (other.hasName()) {
                        bitField0_ |= 0x00000001;
                        name_ = other.name_;
                        onChanged();
                    }
                    if (other.hasIcon()) {
                        bitField0_ |= 0x00000002;
                        icon_ = other.icon_;
                        onChanged();
                    }
                    if (!other.categories_.isEmpty()) {
                        if (categories_.isEmpty()) {
                            categories_ = other.categories_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                        } else {
                            ensureCategoriesIsMutable();
                            categories_.addAll(other.categories_);
                        }
                        onChanged();
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
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;
                // optional string name = 1;
                private java.lang.Object name_ = "";
                /**
                 * <code>optional string name = 1;</code>
                 */
                public boolean hasName() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>optional string name = 1;</code>
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
                 * <code>optional string name = 1;</code>
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
                 * <code>optional string name = 1;</code>
                 */
                public Builder setName(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    name_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string name = 1;</code>
                 */
                public Builder clearName() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    name_ = getDefaultInstance().getName();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string name = 1;</code>
                 */
                public Builder setNameBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    name_ = value;
                    onChanged();
                    return this;
                }
                // optional string icon = 2;
                private java.lang.Object icon_ = "";
                /**
                 * <code>optional string icon = 2;</code>
                 */
                public boolean hasIcon() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional string icon = 2;</code>
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
                 * <code>optional string icon = 2;</code>
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
                 * <code>optional string icon = 2;</code>
                 */
                public Builder setIcon(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    icon_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string icon = 2;</code>
                 */
                public Builder clearIcon() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    icon_ = getDefaultInstance().getIcon();
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional string icon = 2;</code>
                 */
                public Builder setIconBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    icon_ = value;
                    onChanged();
                    return this;
                }
                // repeated string categories = 3;
                private com.google.protobuf.LazyStringList categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                private void ensureCategoriesIsMutable() {
                    if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                        categories_ = new com.google.protobuf.LazyStringArrayList(categories_);
                        bitField0_ |= 0x00000004;
                    }
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public java.util.List<java.lang.String>
                getCategoriesList() {
                    return java.util.Collections.unmodifiableList(categories_);
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public int getCategoriesCount() {
                    return categories_.size();
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public java.lang.String getCategories(int index) {
                    return categories_.get(index);
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public com.google.protobuf.ByteString
                getCategoriesBytes(int index) {
                    return categories_.getByteString(index);
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public Builder setCategories(
                        int index, java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCategoriesIsMutable();
                    categories_.set(index, value);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public Builder addCategories(
                        java.lang.String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCategoriesIsMutable();
                    categories_.add(value);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public Builder addAllCategories(
                        java.lang.Iterable<java.lang.String> values) {
                    ensureCategoriesIsMutable();
                    super.addAll(values, categories_);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public Builder clearCategories() {
                    categories_ = com.google.protobuf.LazyStringArrayList.EMPTY;
                    bitField0_ = (bitField0_ & ~0x00000004);
                    onChanged();
                    return this;
                }
                /**
                 * <code>repeated string categories = 3;</code>
                 */
                public Builder addCategoriesBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureCategoriesIsMutable();
                    categories_.add(value);
                    onChanged();
                    return this;
                }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAppStatus.ShortcutInfo)
            }
            static {
                defaultInstance = new ShortcutInfo(true);
                defaultInstance.initFields();
            }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAppStatus.ShortcutInfo)
        }
        public interface AppStatusOrBuilder
                extends com.google.protobuf.MessageOrBuilder {
// optional uint32 app_id = 1;
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            boolean hasAppId();
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            int getAppId();
// optional uint32 app_state = 2;
            /**
             * <code>optional uint32 app_state = 2;</code>
             */
            boolean hasAppState();
            /**
             * <code>optional uint32 app_state = 2;</code>
             */
            int getAppState();
// optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;
            /**
             * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
             */
            boolean hasUpdateInfo();
            /**
             * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
             */
            SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo getUpdateInfo();
            /**
             * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
             */
            SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder getUpdateInfoOrBuilder();
// optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;
            /**
             * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
             */
            boolean hasShortcutInfo();
            /**
             * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
             */
            SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo getShortcutInfo();
            /**
             * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
             */
            SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder getShortcutInfoOrBuilder();
        }
        /**
         * Protobuf type {@code CMsgRemoteClientAppStatus.AppStatus}
         */
        public static final class AppStatus extends
                com.google.protobuf.GeneratedMessage
                implements AppStatusOrBuilder {
            // Use AppStatus.newBuilder() to construct.
            private AppStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.unknownFields = builder.getUnknownFields();
            }
            private AppStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
            private static final AppStatus defaultInstance;
            public static AppStatus getDefaultInstance() {
                return defaultInstance;
            }
            public AppStatus getDefaultInstanceForType() {
                return defaultInstance;
            }
            private final com.google.protobuf.UnknownFieldSet unknownFields;
            @java.lang.Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private AppStatus(
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
                                appId_ = input.readUInt32();
                                break;
                            }
                            case 16: {
                                bitField0_ |= 0x00000002;
                                appState_ = input.readUInt32();
                                break;
                            }
                            case 26: {
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder subBuilder = null;
                                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                    subBuilder = updateInfo_.toBuilder();
                                }
                                updateInfo_ = input.readMessage(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.PARSER, extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(updateInfo_);
                                    updateInfo_ = subBuilder.buildPartial();
                                }
                                bitField0_ |= 0x00000004;
                                break;
                            }
                            case 34: {
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder subBuilder = null;
                                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                                    subBuilder = shortcutInfo_.toBuilder();
                                }
                                shortcutInfo_ = input.readMessage(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.PARSER, extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(shortcutInfo_);
                                    shortcutInfo_ = subBuilder.buildPartial();
                                }
                                bitField0_ |= 0x00000008;
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
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppStatus_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppStatus_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder.class);
            }
            public static com.google.protobuf.Parser<AppStatus> PARSER =
                    new com.google.protobuf.AbstractParser<AppStatus>() {
                        public AppStatus parsePartialFrom(
                                com.google.protobuf.CodedInputStream input,
                                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                throws com.google.protobuf.InvalidProtocolBufferException {
                            return new AppStatus(input, extensionRegistry);
                        }
                    };
            @java.lang.Override
            public com.google.protobuf.Parser<AppStatus> getParserForType() {
                return PARSER;
            }
            private int bitField0_;
            // optional uint32 app_id = 1;
            public static final int APP_ID_FIELD_NUMBER = 1;
            private int appId_;
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public boolean hasAppId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public int getAppId() {
                return appId_;
            }
            // optional uint32 app_state = 2;
            public static final int APP_STATE_FIELD_NUMBER = 2;
            private int appState_;
            /**
             * <code>optional uint32 app_state = 2;</code>
             */
            public boolean hasAppState() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint32 app_state = 2;</code>
             */
            public int getAppState() {
                return appState_;
            }
            // optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;
            public static final int UPDATE_INFO_FIELD_NUMBER = 3;
            private SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo updateInfo_;
            /**
             * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
             */
            public boolean hasUpdateInfo() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo getUpdateInfo() {
                return updateInfo_;
            }
            /**
             * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder getUpdateInfoOrBuilder() {
                return updateInfo_;
            }
            // optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;
            public static final int SHORTCUT_INFO_FIELD_NUMBER = 4;
            private SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo shortcutInfo_;
            /**
             * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
             */
            public boolean hasShortcutInfo() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo getShortcutInfo() {
                return shortcutInfo_;
            }
            /**
             * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder getShortcutInfoOrBuilder() {
                return shortcutInfo_;
            }
            private void initFields() {
                appId_ = 0;
                appState_ = 0;
                updateInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance();
                shortcutInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance();
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
                    output.writeUInt32(1, appId_);
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    output.writeUInt32(2, appState_);
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    output.writeMessage(3, updateInfo_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    output.writeMessage(4, shortcutInfo_);
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
                            .computeUInt32Size(1, appId_);
                }
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeUInt32Size(2, appState_);
                }
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(3, updateInfo_);
                }
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                    size += com.google.protobuf.CodedOutputStream
                            .computeMessageSize(4, shortcutInfo_);
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
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseDelimitedFrom(input, extensionRegistry);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return PARSER.parseFrom(input);
            }
            public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return PARSER.parseFrom(input, extensionRegistry);
            }
            public static Builder newBuilder() { return Builder.create(); }
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus prototype) {
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
             * Protobuf type {@code CMsgRemoteClientAppStatus.AppStatus}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                    implements SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppStatus_descriptor;
                }
                protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppStatus_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder.class);
                }
                // Construct using SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.newBuilder()
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
                        getUpdateInfoFieldBuilder();
                        getShortcutInfoFieldBuilder();
                    }
                }
                private static Builder create() {
                    return new Builder();
                }
                public Builder clear() {
                    super.clear();
                    appId_ = 0;
                    bitField0_ = (bitField0_ & ~0x00000001);
                    appState_ = 0;
                    bitField0_ = (bitField0_ & ~0x00000002);
                    if (updateInfoBuilder_ == null) {
                        updateInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance();
                    } else {
                        updateInfoBuilder_.clear();
                    }
                    bitField0_ = (bitField0_ & ~0x00000004);
                    if (shortcutInfoBuilder_ == null) {
                        shortcutInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance();
                    } else {
                        shortcutInfoBuilder_.clear();
                    }
                    bitField0_ = (bitField0_ & ~0x00000008);
                    return this;
                }
                public Builder clone() {
                    return create().mergeFrom(buildPartial());
                }
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_AppStatus_descriptor;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus getDefaultInstanceForType() {
                    return SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.getDefaultInstance();
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus build() {
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus buildPartial() {
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus result = new SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.appId_ = appId_;
                    if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.appState_ = appState_;
                    if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                        to_bitField0_ |= 0x00000004;
                    }
                    if (updateInfoBuilder_ == null) {
                        result.updateInfo_ = updateInfo_;
                    } else {
                        result.updateInfo_ = updateInfoBuilder_.build();
                    }
                    if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                        to_bitField0_ |= 0x00000008;
                    }
                    if (shortcutInfoBuilder_ == null) {
                        result.shortcutInfo_ = shortcutInfo_;
                    } else {
                        result.shortcutInfo_ = shortcutInfoBuilder_.build();
                    }
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus) {
                        return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }
                public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus other) {
                    if (other == SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.getDefaultInstance()) return this;
                    if (other.hasAppId()) {
                        setAppId(other.getAppId());
                    }
                    if (other.hasAppState()) {
                        setAppState(other.getAppState());
                    }
                    if (other.hasUpdateInfo()) {
                        mergeUpdateInfo(other.getUpdateInfo());
                    }
                    if (other.hasShortcutInfo()) {
                        mergeShortcutInfo(other.getShortcutInfo());
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
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus) e.getUnfinishedMessage();
                        throw e;
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;
                // optional uint32 app_id = 1;
                private int appId_ ;
                /**
                 * <code>optional uint32 app_id = 1;</code>
                 */
                public boolean hasAppId() {
                    return ((bitField0_ & 0x00000001) == 0x00000001);
                }
                /**
                 * <code>optional uint32 app_id = 1;</code>
                 */
                public int getAppId() {
                    return appId_;
                }
                /**
                 * <code>optional uint32 app_id = 1;</code>
                 */
                public Builder setAppId(int value) {
                    bitField0_ |= 0x00000001;
                    appId_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint32 app_id = 1;</code>
                 */
                public Builder clearAppId() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    appId_ = 0;
                    onChanged();
                    return this;
                }
                // optional uint32 app_state = 2;
                private int appState_ ;
                /**
                 * <code>optional uint32 app_state = 2;</code>
                 */
                public boolean hasAppState() {
                    return ((bitField0_ & 0x00000002) == 0x00000002);
                }
                /**
                 * <code>optional uint32 app_state = 2;</code>
                 */
                public int getAppState() {
                    return appState_;
                }
                /**
                 * <code>optional uint32 app_state = 2;</code>
                 */
                public Builder setAppState(int value) {
                    bitField0_ |= 0x00000002;
                    appState_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <code>optional uint32 app_state = 2;</code>
                 */
                public Builder clearAppState() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    appState_ = 0;
                    onChanged();
                    return this;
                }
                // optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;
                private SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo updateInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance();
                private com.google.protobuf.SingleFieldBuilder<
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder> updateInfoBuilder_;
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public boolean hasUpdateInfo() {
                    return ((bitField0_ & 0x00000004) == 0x00000004);
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo getUpdateInfo() {
                    if (updateInfoBuilder_ == null) {
                        return updateInfo_;
                    } else {
                        return updateInfoBuilder_.getMessage();
                    }
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public Builder setUpdateInfo(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo value) {
                    if (updateInfoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        updateInfo_ = value;
                        onChanged();
                    } else {
                        updateInfoBuilder_.setMessage(value);
                    }
                    bitField0_ |= 0x00000004;
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public Builder setUpdateInfo(
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder builderForValue) {
                    if (updateInfoBuilder_ == null) {
                        updateInfo_ = builderForValue.build();
                        onChanged();
                    } else {
                        updateInfoBuilder_.setMessage(builderForValue.build());
                    }
                    bitField0_ |= 0x00000004;
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public Builder mergeUpdateInfo(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo value) {
                    if (updateInfoBuilder_ == null) {
                        if (((bitField0_ & 0x00000004) == 0x00000004) &&
                                updateInfo_ != SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance()) {
                            updateInfo_ =
                                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.newBuilder(updateInfo_).mergeFrom(value).buildPartial();
                        } else {
                            updateInfo_ = value;
                        }
                        onChanged();
                    } else {
                        updateInfoBuilder_.mergeFrom(value);
                    }
                    bitField0_ |= 0x00000004;
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public Builder clearUpdateInfo() {
                    if (updateInfoBuilder_ == null) {
                        updateInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.getDefaultInstance();
                        onChanged();
                    } else {
                        updateInfoBuilder_.clear();
                    }
                    bitField0_ = (bitField0_ & ~0x00000004);
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder getUpdateInfoBuilder() {
                    bitField0_ |= 0x00000004;
                    onChanged();
                    return getUpdateInfoFieldBuilder().getBuilder();
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder getUpdateInfoOrBuilder() {
                    if (updateInfoBuilder_ != null) {
                        return updateInfoBuilder_.getMessageOrBuilder();
                    } else {
                        return updateInfo_;
                    }
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.AppUpdateInfo update_info = 3;</code>
                 */
                private com.google.protobuf.SingleFieldBuilder<
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder>
                getUpdateInfoFieldBuilder() {
                    if (updateInfoBuilder_ == null) {
                        updateInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfo.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppUpdateInfoOrBuilder>(
                                updateInfo_,
                                getParentForChildren(),
                                isClean());
                        updateInfo_ = null;
                    }
                    return updateInfoBuilder_;
                }
                // optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;
                private SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo shortcutInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance();
                private com.google.protobuf.SingleFieldBuilder<
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder> shortcutInfoBuilder_;
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public boolean hasShortcutInfo() {
                    return ((bitField0_ & 0x00000008) == 0x00000008);
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo getShortcutInfo() {
                    if (shortcutInfoBuilder_ == null) {
                        return shortcutInfo_;
                    } else {
                        return shortcutInfoBuilder_.getMessage();
                    }
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public Builder setShortcutInfo(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo value) {
                    if (shortcutInfoBuilder_ == null) {
                        if (value == null) {
                            throw new NullPointerException();
                        }
                        shortcutInfo_ = value;
                        onChanged();
                    } else {
                        shortcutInfoBuilder_.setMessage(value);
                    }
                    bitField0_ |= 0x00000008;
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public Builder setShortcutInfo(
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder builderForValue) {
                    if (shortcutInfoBuilder_ == null) {
                        shortcutInfo_ = builderForValue.build();
                        onChanged();
                    } else {
                        shortcutInfoBuilder_.setMessage(builderForValue.build());
                    }
                    bitField0_ |= 0x00000008;
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public Builder mergeShortcutInfo(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo value) {
                    if (shortcutInfoBuilder_ == null) {
                        if (((bitField0_ & 0x00000008) == 0x00000008) &&
                                shortcutInfo_ != SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance()) {
                            shortcutInfo_ =
                                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.newBuilder(shortcutInfo_).mergeFrom(value).buildPartial();
                        } else {
                            shortcutInfo_ = value;
                        }
                        onChanged();
                    } else {
                        shortcutInfoBuilder_.mergeFrom(value);
                    }
                    bitField0_ |= 0x00000008;
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public Builder clearShortcutInfo() {
                    if (shortcutInfoBuilder_ == null) {
                        shortcutInfo_ = SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.getDefaultInstance();
                        onChanged();
                    } else {
                        shortcutInfoBuilder_.clear();
                    }
                    bitField0_ = (bitField0_ & ~0x00000008);
                    return this;
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder getShortcutInfoBuilder() {
                    bitField0_ |= 0x00000008;
                    onChanged();
                    return getShortcutInfoFieldBuilder().getBuilder();
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder getShortcutInfoOrBuilder() {
                    if (shortcutInfoBuilder_ != null) {
                        return shortcutInfoBuilder_.getMessageOrBuilder();
                    } else {
                        return shortcutInfo_;
                    }
                }
                /**
                 * <code>optional .CMsgRemoteClientAppStatus.ShortcutInfo shortcut_info = 4;</code>
                 */
                private com.google.protobuf.SingleFieldBuilder<
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder>
                getShortcutInfoFieldBuilder() {
                    if (shortcutInfoBuilder_ == null) {
                        shortcutInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfo.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.ShortcutInfoOrBuilder>(
                                shortcutInfo_,
                                getParentForChildren(),
                                isClean());
                        shortcutInfo_ = null;
                    }
                    return shortcutInfoBuilder_;
                }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAppStatus.AppStatus)
            }
            static {
                defaultInstance = new AppStatus(true);
                defaultInstance.initFields();
            }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAppStatus.AppStatus)
        }
        // repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;
        public static final int STATUS_UPDATES_FIELD_NUMBER = 1;
        private java.util.List<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus> statusUpdates_;
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        public java.util.List<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus> getStatusUpdatesList() {
            return statusUpdates_;
        }
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        public java.util.List<? extends SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder>
        getStatusUpdatesOrBuilderList() {
            return statusUpdates_;
        }
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        public int getStatusUpdatesCount() {
            return statusUpdates_.size();
        }
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus getStatusUpdates(int index) {
            return statusUpdates_.get(index);
        }
        /**
         * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
         */
        public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder getStatusUpdatesOrBuilder(
                int index) {
            return statusUpdates_.get(index);
        }
        private void initFields() {
            statusUpdates_ = java.util.Collections.emptyList();
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
            for (int i = 0; i < statusUpdates_.size(); i++) {
                output.writeMessage(1, statusUpdates_.get(i));
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            for (int i = 0; i < statusUpdates_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, statusUpdates_.get(i));
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
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAppStatus parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAppStatus prototype) {
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
         * Protobuf type {@code CMsgRemoteClientAppStatus}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientAppStatusOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAppStatus.class, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientAppStatus.newBuilder()
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
                    getStatusUpdatesFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                if (statusUpdatesBuilder_ == null) {
                    statusUpdates_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    statusUpdatesBuilder_.clear();
                }
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAppStatus_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientAppStatus.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus build() {
                SteamMsgRemoteClient.CMsgRemoteClientAppStatus result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientAppStatus result = new SteamMsgRemoteClient.CMsgRemoteClientAppStatus(this);
                int from_bitField0_ = bitField0_;
                if (statusUpdatesBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        statusUpdates_ = java.util.Collections.unmodifiableList(statusUpdates_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.statusUpdates_ = statusUpdates_;
                } else {
                    result.statusUpdates_ = statusUpdatesBuilder_.build();
                }
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAppStatus) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAppStatus)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAppStatus other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientAppStatus.getDefaultInstance()) return this;
                if (statusUpdatesBuilder_ == null) {
                    if (!other.statusUpdates_.isEmpty()) {
                        if (statusUpdates_.isEmpty()) {
                            statusUpdates_ = other.statusUpdates_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureStatusUpdatesIsMutable();
                            statusUpdates_.addAll(other.statusUpdates_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.statusUpdates_.isEmpty()) {
                        if (statusUpdatesBuilder_.isEmpty()) {
                            statusUpdatesBuilder_.dispose();
                            statusUpdatesBuilder_ = null;
                            statusUpdates_ = other.statusUpdates_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            statusUpdatesBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                                            getStatusUpdatesFieldBuilder() : null;
                        } else {
                            statusUpdatesBuilder_.addAllMessages(other.statusUpdates_);
                        }
                    }
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
                SteamMsgRemoteClient.CMsgRemoteClientAppStatus parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAppStatus) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;
            private java.util.List<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus> statusUpdates_ =
                    java.util.Collections.emptyList();
            private void ensureStatusUpdatesIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    statusUpdates_ = new java.util.ArrayList<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus>(statusUpdates_);
                    bitField0_ |= 0x00000001;
                }
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder> statusUpdatesBuilder_;
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public java.util.List<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus> getStatusUpdatesList() {
                if (statusUpdatesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(statusUpdates_);
                } else {
                    return statusUpdatesBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public int getStatusUpdatesCount() {
                if (statusUpdatesBuilder_ == null) {
                    return statusUpdates_.size();
                } else {
                    return statusUpdatesBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus getStatusUpdates(int index) {
                if (statusUpdatesBuilder_ == null) {
                    return statusUpdates_.get(index);
                } else {
                    return statusUpdatesBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder setStatusUpdates(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus value) {
                if (statusUpdatesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.set(index, value);
                    onChanged();
                } else {
                    statusUpdatesBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder setStatusUpdates(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder builderForValue) {
                if (statusUpdatesBuilder_ == null) {
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    statusUpdatesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder addStatusUpdates(SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus value) {
                if (statusUpdatesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.add(value);
                    onChanged();
                } else {
                    statusUpdatesBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder addStatusUpdates(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus value) {
                if (statusUpdatesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.add(index, value);
                    onChanged();
                } else {
                    statusUpdatesBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder addStatusUpdates(
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder builderForValue) {
                if (statusUpdatesBuilder_ == null) {
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.add(builderForValue.build());
                    onChanged();
                } else {
                    statusUpdatesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder addStatusUpdates(
                    int index, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder builderForValue) {
                if (statusUpdatesBuilder_ == null) {
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    statusUpdatesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder addAllStatusUpdates(
                    java.lang.Iterable<? extends SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus> values) {
                if (statusUpdatesBuilder_ == null) {
                    ensureStatusUpdatesIsMutable();
                    super.addAll(values, statusUpdates_);
                    onChanged();
                } else {
                    statusUpdatesBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder clearStatusUpdates() {
                if (statusUpdatesBuilder_ == null) {
                    statusUpdates_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    statusUpdatesBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public Builder removeStatusUpdates(int index) {
                if (statusUpdatesBuilder_ == null) {
                    ensureStatusUpdatesIsMutable();
                    statusUpdates_.remove(index);
                    onChanged();
                } else {
                    statusUpdatesBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder getStatusUpdatesBuilder(
                    int index) {
                return getStatusUpdatesFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder getStatusUpdatesOrBuilder(
                    int index) {
                if (statusUpdatesBuilder_ == null) {
                    return statusUpdates_.get(index); } else {
                    return statusUpdatesBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public java.util.List<? extends SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder>
            getStatusUpdatesOrBuilderList() {
                if (statusUpdatesBuilder_ != null) {
                    return statusUpdatesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(statusUpdates_);
                }
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder addStatusUpdatesBuilder() {
                return getStatusUpdatesFieldBuilder().addBuilder(
                        SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.getDefaultInstance());
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder addStatusUpdatesBuilder(
                    int index) {
                return getStatusUpdatesFieldBuilder().addBuilder(
                        index, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.getDefaultInstance());
            }
            /**
             * <code>repeated .CMsgRemoteClientAppStatus.AppStatus status_updates = 1;</code>
             */
            public java.util.List<SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder>
            getStatusUpdatesBuilderList() {
                return getStatusUpdatesFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<
                    SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder>
            getStatusUpdatesFieldBuilder() {
                if (statusUpdatesBuilder_ == null) {
                    statusUpdatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
                            SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatus.Builder, SteamMsgRemoteClient.CMsgRemoteClientAppStatus.AppStatusOrBuilder>(
                            statusUpdates_,
                            ((bitField0_ & 0x00000001) == 0x00000001),
                            getParentForChildren(),
                            isClean());
                    statusUpdates_ = null;
                }
                return statusUpdatesBuilder_;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAppStatus)
        }
        static {
            defaultInstance = new CMsgRemoteClientAppStatus(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAppStatus)
    }
    public interface CMsgRemoteClientAuthOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint64 client_id = 1;
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        boolean hasClientId();
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        long getClientId();
// optional .CMsgRemoteClientBroadcastStatus status = 2;
        /**
         * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
         */
        boolean hasStatus();
        /**
         * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
         */
        SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus getStatus();
        /**
         * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
         */
        SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder getStatusOrBuilder();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientAuth}
     */
    public static final class CMsgRemoteClientAuth extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientAuthOrBuilder {
        // Use CMsgRemoteClientAuth.newBuilder() to construct.
        private CMsgRemoteClientAuth(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientAuth(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientAuth defaultInstance;
        public static CMsgRemoteClientAuth getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientAuth getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientAuth(
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
                            clientId_ = input.readUInt64();
                            break;
                        }
                        case 18: {
                            SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = status_.toBuilder();
                            }
                            status_ = input.readMessage(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(status_);
                                status_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuth_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuth_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientAuth.class, SteamMsgRemoteClient.CMsgRemoteClientAuth.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientAuth> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientAuth>() {
                    public CMsgRemoteClientAuth parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientAuth(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientAuth> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint64 client_id = 1;
        public static final int CLIENT_ID_FIELD_NUMBER = 1;
        private long clientId_;
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        public boolean hasClientId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 client_id = 1;</code>
         */
        public long getClientId() {
            return clientId_;
        }
        // optional .CMsgRemoteClientBroadcastStatus status = 2;
        public static final int STATUS_FIELD_NUMBER = 2;
        private SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus status_;
        /**
         * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
         */
        public boolean hasStatus() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
         */
        public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus getStatus() {
            return status_;
        }
        /**
         * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
         */
        public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder getStatusOrBuilder() {
            return status_;
        }
        private void initFields() {
            clientId_ = 0L;
            status_ = SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance();
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
                output.writeUInt64(1, clientId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, status_);
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
                        .computeUInt64Size(1, clientId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, status_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuth parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAuth prototype) {
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
         * Protobuf type {@code CMsgRemoteClientAuth}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientAuthOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuth_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuth_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAuth.class, SteamMsgRemoteClient.CMsgRemoteClientAuth.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientAuth.newBuilder()
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
                    getStatusFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }
            public Builder clear() {
                super.clear();
                clientId_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (statusBuilder_ == null) {
                    status_ = SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance();
                } else {
                    statusBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuth_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAuth getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientAuth.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAuth build() {
                SteamMsgRemoteClient.CMsgRemoteClientAuth result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAuth buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientAuth result = new SteamMsgRemoteClient.CMsgRemoteClientAuth(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.clientId_ = clientId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (statusBuilder_ == null) {
                    result.status_ = status_;
                } else {
                    result.status_ = statusBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAuth) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAuth)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAuth other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientAuth.getDefaultInstance()) return this;
                if (other.hasClientId()) {
                    setClientId(other.getClientId());
                }
                if (other.hasStatus()) {
                    mergeStatus(other.getStatus());
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
                SteamMsgRemoteClient.CMsgRemoteClientAuth parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAuth) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint64 client_id = 1;
            private long clientId_ ;
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public boolean hasClientId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public long getClientId() {
                return clientId_;
            }
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public Builder setClientId(long value) {
                bitField0_ |= 0x00000001;
                clientId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 client_id = 1;</code>
             */
            public Builder clearClientId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                clientId_ = 0L;
                onChanged();
                return this;
            }
            // optional .CMsgRemoteClientBroadcastStatus status = 2;
            private SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus status_ = SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder> statusBuilder_;
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public boolean hasStatus() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus getStatus() {
                if (statusBuilder_ == null) {
                    return status_;
                } else {
                    return statusBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public Builder setStatus(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus value) {
                if (statusBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    status_ = value;
                    onChanged();
                } else {
                    statusBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public Builder setStatus(
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder builderForValue) {
                if (statusBuilder_ == null) {
                    status_ = builderForValue.build();
                    onChanged();
                } else {
                    statusBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public Builder mergeStatus(SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus value) {
                if (statusBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            status_ != SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance()) {
                        status_ =
                                SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.newBuilder(status_).mergeFrom(value).buildPartial();
                    } else {
                        status_ = value;
                    }
                    onChanged();
                } else {
                    statusBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public Builder clearStatus() {
                if (statusBuilder_ == null) {
                    status_ = SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.getDefaultInstance();
                    onChanged();
                } else {
                    statusBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder getStatusBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getStatusFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            public SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder getStatusOrBuilder() {
                if (statusBuilder_ != null) {
                    return statusBuilder_.getMessageOrBuilder();
                } else {
                    return status_;
                }
            }
            /**
             * <code>optional .CMsgRemoteClientBroadcastStatus status = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<
                    SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder>
            getStatusFieldBuilder() {
                if (statusBuilder_ == null) {
                    statusBuilder_ = new com.google.protobuf.SingleFieldBuilder<
                            SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatus.Builder, SteamMsgRemoteClient.CMsgRemoteClientBroadcastStatusOrBuilder>(
                            status_,
                            getParentForChildren(),
                            isClean());
                    status_ = null;
                }
                return statusBuilder_;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAuth)
        }
        static {
            defaultInstance = new CMsgRemoteClientAuth(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAuth)
    }
    public interface CMsgRemoteClientAuthResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional int32 eresult = 1 [default = 2];
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        boolean hasEresult();
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        int getEresult();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientAuthResponse}
     */
    public static final class CMsgRemoteClientAuthResponse extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientAuthResponseOrBuilder {
        // Use CMsgRemoteClientAuthResponse.newBuilder() to construct.
        private CMsgRemoteClientAuthResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientAuthResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientAuthResponse defaultInstance;
        public static CMsgRemoteClientAuthResponse getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientAuthResponse getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientAuthResponse(
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
                            eresult_ = input.readInt32();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuthResponse_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuthResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.class, SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientAuthResponse> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientAuthResponse>() {
                    public CMsgRemoteClientAuthResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientAuthResponse(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientAuthResponse> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional int32 eresult = 1 [default = 2];
        public static final int ERESULT_FIELD_NUMBER = 1;
        private int eresult_;
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        public boolean hasEresult() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        public int getEresult() {
            return eresult_;
        }
        private void initFields() {
            eresult_ = 2;
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
                output.writeInt32(1, eresult_);
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
                        .computeInt32Size(1, eresult_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAuthResponse prototype) {
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
         * Protobuf type {@code CMsgRemoteClientAuthResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientAuthResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuthResponse_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuthResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.class, SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.newBuilder()
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
                eresult_ = 2;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAuthResponse_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAuthResponse getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAuthResponse build() {
                SteamMsgRemoteClient.CMsgRemoteClientAuthResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAuthResponse buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientAuthResponse result = new SteamMsgRemoteClient.CMsgRemoteClientAuthResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.eresult_ = eresult_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAuthResponse) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAuthResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAuthResponse other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientAuthResponse.getDefaultInstance()) return this;
                if (other.hasEresult()) {
                    setEresult(other.getEresult());
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
                SteamMsgRemoteClient.CMsgRemoteClientAuthResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAuthResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional int32 eresult = 1 [default = 2];
            private int eresult_ = 2;
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public boolean hasEresult() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public int getEresult() {
                return eresult_;
            }
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public Builder setEresult(int value) {
                bitField0_ |= 0x00000001;
                eresult_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public Builder clearEresult() {
                bitField0_ = (bitField0_ & ~0x00000001);
                eresult_ = 2;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAuthResponse)
        }
        static {
            defaultInstance = new CMsgRemoteClientAuthResponse(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAuthResponse)
    }
    public interface CMsgRemoteClientStartStreamOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint32 app_id = 1;
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        boolean hasAppId();
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        int getAppId();
// optional int32 environment = 2;
        /**
         * <code>optional int32 environment = 2;</code>
         */
        boolean hasEnvironment();
        /**
         * <code>optional int32 environment = 2;</code>
         */
        int getEnvironment();
// optional int32 gamepad_count = 3;
        /**
         * <code>optional int32 gamepad_count = 3;</code>
         */
        boolean hasGamepadCount();
        /**
         * <code>optional int32 gamepad_count = 3;</code>
         */
        int getGamepadCount();
// optional int32 launch_option = 4 [default = -1];
        /**
         * <code>optional int32 launch_option = 4 [default = -1];</code>
         */
        boolean hasLaunchOption();
        /**
         * <code>optional int32 launch_option = 4 [default = -1];</code>
         */
        int getLaunchOption();
// optional bool lock_parental_lock = 5 [default = false];
        /**
         * <code>optional bool lock_parental_lock = 5 [default = false];</code>
         */
        boolean hasLockParentalLock();
        /**
         * <code>optional bool lock_parental_lock = 5 [default = false];</code>
         */
        boolean getLockParentalLock();
// optional string unlock_parental_lock = 6;
        /**
         * <code>optional string unlock_parental_lock = 6;</code>
         */
        boolean hasUnlockParentalLock();
        /**
         * <code>optional string unlock_parental_lock = 6;</code>
         */
        java.lang.String getUnlockParentalLock();
        /**
         * <code>optional string unlock_parental_lock = 6;</code>
         */
        com.google.protobuf.ByteString
        getUnlockParentalLockBytes();
// optional int32 maximum_resolution_x = 7;
        /**
         * <code>optional int32 maximum_resolution_x = 7;</code>
         */
        boolean hasMaximumResolutionX();
        /**
         * <code>optional int32 maximum_resolution_x = 7;</code>
         */
        int getMaximumResolutionX();
// optional int32 maximum_resolution_y = 8;
        /**
         * <code>optional int32 maximum_resolution_y = 8;</code>
         */
        boolean hasMaximumResolutionY();
        /**
         * <code>optional int32 maximum_resolution_y = 8;</code>
         */
        int getMaximumResolutionY();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientStartStream}
     */
    public static final class CMsgRemoteClientStartStream extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientStartStreamOrBuilder {
        // Use CMsgRemoteClientStartStream.newBuilder() to construct.
        private CMsgRemoteClientStartStream(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientStartStream(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientStartStream defaultInstance;
        public static CMsgRemoteClientStartStream getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientStartStream getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientStartStream(
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
                            appId_ = input.readUInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            environment_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            gamepadCount_ = input.readInt32();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            launchOption_ = input.readInt32();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            lockParentalLock_ = input.readBool();
                            break;
                        }
                        case 50: {
                            bitField0_ |= 0x00000020;
                            unlockParentalLock_ = input.readBytes();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            maximumResolutionX_ = input.readInt32();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000080;
                            maximumResolutionY_ = input.readInt32();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStream_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStream_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientStartStream.class, SteamMsgRemoteClient.CMsgRemoteClientStartStream.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientStartStream> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientStartStream>() {
                    public CMsgRemoteClientStartStream parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientStartStream(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientStartStream> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint32 app_id = 1;
        public static final int APP_ID_FIELD_NUMBER = 1;
        private int appId_;
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        public boolean hasAppId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        public int getAppId() {
            return appId_;
        }
        // optional int32 environment = 2;
        public static final int ENVIRONMENT_FIELD_NUMBER = 2;
        private int environment_;
        /**
         * <code>optional int32 environment = 2;</code>
         */
        public boolean hasEnvironment() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int32 environment = 2;</code>
         */
        public int getEnvironment() {
            return environment_;
        }
        // optional int32 gamepad_count = 3;
        public static final int GAMEPAD_COUNT_FIELD_NUMBER = 3;
        private int gamepadCount_;
        /**
         * <code>optional int32 gamepad_count = 3;</code>
         */
        public boolean hasGamepadCount() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional int32 gamepad_count = 3;</code>
         */
        public int getGamepadCount() {
            return gamepadCount_;
        }
        // optional int32 launch_option = 4 [default = -1];
        public static final int LAUNCH_OPTION_FIELD_NUMBER = 4;
        private int launchOption_;
        /**
         * <code>optional int32 launch_option = 4 [default = -1];</code>
         */
        public boolean hasLaunchOption() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional int32 launch_option = 4 [default = -1];</code>
         */
        public int getLaunchOption() {
            return launchOption_;
        }
        // optional bool lock_parental_lock = 5 [default = false];
        public static final int LOCK_PARENTAL_LOCK_FIELD_NUMBER = 5;
        private boolean lockParentalLock_;
        /**
         * <code>optional bool lock_parental_lock = 5 [default = false];</code>
         */
        public boolean hasLockParentalLock() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional bool lock_parental_lock = 5 [default = false];</code>
         */
        public boolean getLockParentalLock() {
            return lockParentalLock_;
        }
        // optional string unlock_parental_lock = 6;
        public static final int UNLOCK_PARENTAL_LOCK_FIELD_NUMBER = 6;
        private java.lang.Object unlockParentalLock_;
        /**
         * <code>optional string unlock_parental_lock = 6;</code>
         */
        public boolean hasUnlockParentalLock() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional string unlock_parental_lock = 6;</code>
         */
        public java.lang.String getUnlockParentalLock() {
            java.lang.Object ref = unlockParentalLock_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    unlockParentalLock_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string unlock_parental_lock = 6;</code>
         */
        public com.google.protobuf.ByteString
        getUnlockParentalLockBytes() {
            java.lang.Object ref = unlockParentalLock_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                unlockParentalLock_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }
        // optional int32 maximum_resolution_x = 7;
        public static final int MAXIMUM_RESOLUTION_X_FIELD_NUMBER = 7;
        private int maximumResolutionX_;
        /**
         * <code>optional int32 maximum_resolution_x = 7;</code>
         */
        public boolean hasMaximumResolutionX() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional int32 maximum_resolution_x = 7;</code>
         */
        public int getMaximumResolutionX() {
            return maximumResolutionX_;
        }
        // optional int32 maximum_resolution_y = 8;
        public static final int MAXIMUM_RESOLUTION_Y_FIELD_NUMBER = 8;
        private int maximumResolutionY_;
        /**
         * <code>optional int32 maximum_resolution_y = 8;</code>
         */
        public boolean hasMaximumResolutionY() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional int32 maximum_resolution_y = 8;</code>
         */
        public int getMaximumResolutionY() {
            return maximumResolutionY_;
        }
        private void initFields() {
            appId_ = 0;
            environment_ = 0;
            gamepadCount_ = 0;
            launchOption_ = -1;
            lockParentalLock_ = false;
            unlockParentalLock_ = "";
            maximumResolutionX_ = 0;
            maximumResolutionY_ = 0;
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
                output.writeUInt32(1, appId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, environment_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, gamepadCount_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt32(4, launchOption_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBool(5, lockParentalLock_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBytes(6, getUnlockParentalLockBytes());
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeInt32(7, maximumResolutionX_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeInt32(8, maximumResolutionY_);
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
                        .computeUInt32Size(1, appId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, environment_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, gamepadCount_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, launchOption_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(5, lockParentalLock_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(6, getUnlockParentalLockBytes());
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(7, maximumResolutionX_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(8, maximumResolutionY_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStream parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientStartStream prototype) {
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
         * Protobuf type {@code CMsgRemoteClientStartStream}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientStartStreamOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStream_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStream_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientStartStream.class, SteamMsgRemoteClient.CMsgRemoteClientStartStream.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientStartStream.newBuilder()
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
                appId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                environment_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                gamepadCount_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                launchOption_ = -1;
                bitField0_ = (bitField0_ & ~0x00000008);
                lockParentalLock_ = false;
                bitField0_ = (bitField0_ & ~0x00000010);
                unlockParentalLock_ = "";
                bitField0_ = (bitField0_ & ~0x00000020);
                maximumResolutionX_ = 0;
                bitField0_ = (bitField0_ & ~0x00000040);
                maximumResolutionY_ = 0;
                bitField0_ = (bitField0_ & ~0x00000080);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStream_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStartStream getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientStartStream.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStartStream build() {
                SteamMsgRemoteClient.CMsgRemoteClientStartStream result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStartStream buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientStartStream result = new SteamMsgRemoteClient.CMsgRemoteClientStartStream(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.appId_ = appId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.environment_ = environment_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.gamepadCount_ = gamepadCount_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.launchOption_ = launchOption_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.lockParentalLock_ = lockParentalLock_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.unlockParentalLock_ = unlockParentalLock_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.maximumResolutionX_ = maximumResolutionX_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.maximumResolutionY_ = maximumResolutionY_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientStartStream) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientStartStream)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientStartStream other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientStartStream.getDefaultInstance()) return this;
                if (other.hasAppId()) {
                    setAppId(other.getAppId());
                }
                if (other.hasEnvironment()) {
                    setEnvironment(other.getEnvironment());
                }
                if (other.hasGamepadCount()) {
                    setGamepadCount(other.getGamepadCount());
                }
                if (other.hasLaunchOption()) {
                    setLaunchOption(other.getLaunchOption());
                }
                if (other.hasLockParentalLock()) {
                    setLockParentalLock(other.getLockParentalLock());
                }
                if (other.hasUnlockParentalLock()) {
                    bitField0_ |= 0x00000020;
                    unlockParentalLock_ = other.unlockParentalLock_;
                    onChanged();
                }
                if (other.hasMaximumResolutionX()) {
                    setMaximumResolutionX(other.getMaximumResolutionX());
                }
                if (other.hasMaximumResolutionY()) {
                    setMaximumResolutionY(other.getMaximumResolutionY());
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
                SteamMsgRemoteClient.CMsgRemoteClientStartStream parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientStartStream) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint32 app_id = 1;
            private int appId_ ;
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public boolean hasAppId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public int getAppId() {
                return appId_;
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public Builder setAppId(int value) {
                bitField0_ |= 0x00000001;
                appId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public Builder clearAppId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                appId_ = 0;
                onChanged();
                return this;
            }
            // optional int32 environment = 2;
            private int environment_ ;
            /**
             * <code>optional int32 environment = 2;</code>
             */
            public boolean hasEnvironment() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional int32 environment = 2;</code>
             */
            public int getEnvironment() {
                return environment_;
            }
            /**
             * <code>optional int32 environment = 2;</code>
             */
            public Builder setEnvironment(int value) {
                bitField0_ |= 0x00000002;
                environment_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 environment = 2;</code>
             */
            public Builder clearEnvironment() {
                bitField0_ = (bitField0_ & ~0x00000002);
                environment_ = 0;
                onChanged();
                return this;
            }
            // optional int32 gamepad_count = 3;
            private int gamepadCount_ ;
            /**
             * <code>optional int32 gamepad_count = 3;</code>
             */
            public boolean hasGamepadCount() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional int32 gamepad_count = 3;</code>
             */
            public int getGamepadCount() {
                return gamepadCount_;
            }
            /**
             * <code>optional int32 gamepad_count = 3;</code>
             */
            public Builder setGamepadCount(int value) {
                bitField0_ |= 0x00000004;
                gamepadCount_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 gamepad_count = 3;</code>
             */
            public Builder clearGamepadCount() {
                bitField0_ = (bitField0_ & ~0x00000004);
                gamepadCount_ = 0;
                onChanged();
                return this;
            }
            // optional int32 launch_option = 4 [default = -1];
            private int launchOption_ = -1;
            /**
             * <code>optional int32 launch_option = 4 [default = -1];</code>
             */
            public boolean hasLaunchOption() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional int32 launch_option = 4 [default = -1];</code>
             */
            public int getLaunchOption() {
                return launchOption_;
            }
            /**
             * <code>optional int32 launch_option = 4 [default = -1];</code>
             */
            public Builder setLaunchOption(int value) {
                bitField0_ |= 0x00000008;
                launchOption_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 launch_option = 4 [default = -1];</code>
             */
            public Builder clearLaunchOption() {
                bitField0_ = (bitField0_ & ~0x00000008);
                launchOption_ = -1;
                onChanged();
                return this;
            }
            // optional bool lock_parental_lock = 5 [default = false];
            private boolean lockParentalLock_ ;
            /**
             * <code>optional bool lock_parental_lock = 5 [default = false];</code>
             */
            public boolean hasLockParentalLock() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional bool lock_parental_lock = 5 [default = false];</code>
             */
            public boolean getLockParentalLock() {
                return lockParentalLock_;
            }
            /**
             * <code>optional bool lock_parental_lock = 5 [default = false];</code>
             */
            public Builder setLockParentalLock(boolean value) {
                bitField0_ |= 0x00000010;
                lockParentalLock_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool lock_parental_lock = 5 [default = false];</code>
             */
            public Builder clearLockParentalLock() {
                bitField0_ = (bitField0_ & ~0x00000010);
                lockParentalLock_ = false;
                onChanged();
                return this;
            }
            // optional string unlock_parental_lock = 6;
            private java.lang.Object unlockParentalLock_ = "";
            /**
             * <code>optional string unlock_parental_lock = 6;</code>
             */
            public boolean hasUnlockParentalLock() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional string unlock_parental_lock = 6;</code>
             */
            public java.lang.String getUnlockParentalLock() {
                java.lang.Object ref = unlockParentalLock_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    unlockParentalLock_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>optional string unlock_parental_lock = 6;</code>
             */
            public com.google.protobuf.ByteString
            getUnlockParentalLockBytes() {
                java.lang.Object ref = unlockParentalLock_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    unlockParentalLock_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string unlock_parental_lock = 6;</code>
             */
            public Builder setUnlockParentalLock(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                unlockParentalLock_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string unlock_parental_lock = 6;</code>
             */
            public Builder clearUnlockParentalLock() {
                bitField0_ = (bitField0_ & ~0x00000020);
                unlockParentalLock_ = getDefaultInstance().getUnlockParentalLock();
                onChanged();
                return this;
            }
            /**
             * <code>optional string unlock_parental_lock = 6;</code>
             */
            public Builder setUnlockParentalLockBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                unlockParentalLock_ = value;
                onChanged();
                return this;
            }
            // optional int32 maximum_resolution_x = 7;
            private int maximumResolutionX_ ;
            /**
             * <code>optional int32 maximum_resolution_x = 7;</code>
             */
            public boolean hasMaximumResolutionX() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional int32 maximum_resolution_x = 7;</code>
             */
            public int getMaximumResolutionX() {
                return maximumResolutionX_;
            }
            /**
             * <code>optional int32 maximum_resolution_x = 7;</code>
             */
            public Builder setMaximumResolutionX(int value) {
                bitField0_ |= 0x00000040;
                maximumResolutionX_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 maximum_resolution_x = 7;</code>
             */
            public Builder clearMaximumResolutionX() {
                bitField0_ = (bitField0_ & ~0x00000040);
                maximumResolutionX_ = 0;
                onChanged();
                return this;
            }
            // optional int32 maximum_resolution_y = 8;
            private int maximumResolutionY_ ;
            /**
             * <code>optional int32 maximum_resolution_y = 8;</code>
             */
            public boolean hasMaximumResolutionY() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional int32 maximum_resolution_y = 8;</code>
             */
            public int getMaximumResolutionY() {
                return maximumResolutionY_;
            }
            /**
             * <code>optional int32 maximum_resolution_y = 8;</code>
             */
            public Builder setMaximumResolutionY(int value) {
                bitField0_ |= 0x00000080;
                maximumResolutionY_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 maximum_resolution_y = 8;</code>
             */
            public Builder clearMaximumResolutionY() {
                bitField0_ = (bitField0_ & ~0x00000080);
                maximumResolutionY_ = 0;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientStartStream)
        }
        static {
            defaultInstance = new CMsgRemoteClientStartStream(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientStartStream)
    }
    public interface CMsgRemoteClientStartStreamResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional int32 e_launch_result = 1 [default = 2];
        /**
         * <code>optional int32 e_launch_result = 1 [default = 2];</code>
         */
        boolean hasELaunchResult();
        /**
         * <code>optional int32 e_launch_result = 1 [default = 2];</code>
         */
        int getELaunchResult();
// optional uint32 stream_port = 2;
        /**
         * <code>optional uint32 stream_port = 2;</code>
         */
        boolean hasStreamPort();
        /**
         * <code>optional uint32 stream_port = 2;</code>
         */
        int getStreamPort();
// repeated int32 launch_options = 3;
        /**
         * <code>repeated int32 launch_options = 3;</code>
         */
        java.util.List<java.lang.Integer> getLaunchOptionsList();
        /**
         * <code>repeated int32 launch_options = 3;</code>
         */
        int getLaunchOptionsCount();
        /**
         * <code>repeated int32 launch_options = 3;</code>
         */
        int getLaunchOptions(int index);
// optional bytes auth_token = 4;
        /**
         * <code>optional bytes auth_token = 4;</code>
         */
        boolean hasAuthToken();
        /**
         * <code>optional bytes auth_token = 4;</code>
         */
        com.google.protobuf.ByteString getAuthToken();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientStartStreamResponse}
     */
    public static final class CMsgRemoteClientStartStreamResponse extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientStartStreamResponseOrBuilder {
        // Use CMsgRemoteClientStartStreamResponse.newBuilder() to construct.
        private CMsgRemoteClientStartStreamResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientStartStreamResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientStartStreamResponse defaultInstance;
        public static CMsgRemoteClientStartStreamResponse getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientStartStreamResponse getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientStartStreamResponse(
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
                            eLaunchResult_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            streamPort_ = input.readUInt32();
                            break;
                        }
                        case 24: {
                            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                                launchOptions_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00000004;
                            }
                            launchOptions_.add(input.readInt32());
                            break;
                        }
                        case 26: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                                launchOptions_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00000004;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                launchOptions_.add(input.readInt32());
                            }
                            input.popLimit(limit);
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000004;
                            authToken_ = input.readBytes();
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
                if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                    launchOptions_ = java.util.Collections.unmodifiableList(launchOptions_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStreamResponse_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStreamResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.class, SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientStartStreamResponse> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientStartStreamResponse>() {
                    public CMsgRemoteClientStartStreamResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientStartStreamResponse(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientStartStreamResponse> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional int32 e_launch_result = 1 [default = 2];
        public static final int E_LAUNCH_RESULT_FIELD_NUMBER = 1;
        private int eLaunchResult_;
        /**
         * <code>optional int32 e_launch_result = 1 [default = 2];</code>
         */
        public boolean hasELaunchResult() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional int32 e_launch_result = 1 [default = 2];</code>
         */
        public int getELaunchResult() {
            return eLaunchResult_;
        }
        // optional uint32 stream_port = 2;
        public static final int STREAM_PORT_FIELD_NUMBER = 2;
        private int streamPort_;
        /**
         * <code>optional uint32 stream_port = 2;</code>
         */
        public boolean hasStreamPort() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 stream_port = 2;</code>
         */
        public int getStreamPort() {
            return streamPort_;
        }
        // repeated int32 launch_options = 3;
        public static final int LAUNCH_OPTIONS_FIELD_NUMBER = 3;
        private java.util.List<java.lang.Integer> launchOptions_;
        /**
         * <code>repeated int32 launch_options = 3;</code>
         */
        public java.util.List<java.lang.Integer>
        getLaunchOptionsList() {
            return launchOptions_;
        }
        /**
         * <code>repeated int32 launch_options = 3;</code>
         */
        public int getLaunchOptionsCount() {
            return launchOptions_.size();
        }
        /**
         * <code>repeated int32 launch_options = 3;</code>
         */
        public int getLaunchOptions(int index) {
            return launchOptions_.get(index);
        }
        // optional bytes auth_token = 4;
        public static final int AUTH_TOKEN_FIELD_NUMBER = 4;
        private com.google.protobuf.ByteString authToken_;
        /**
         * <code>optional bytes auth_token = 4;</code>
         */
        public boolean hasAuthToken() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional bytes auth_token = 4;</code>
         */
        public com.google.protobuf.ByteString getAuthToken() {
            return authToken_;
        }
        private void initFields() {
            eLaunchResult_ = 2;
            streamPort_ = 0;
            launchOptions_ = java.util.Collections.emptyList();
            authToken_ = com.google.protobuf.ByteString.EMPTY;
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
                output.writeInt32(1, eLaunchResult_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(2, streamPort_);
            }
            for (int i = 0; i < launchOptions_.size(); i++) {
                output.writeInt32(3, launchOptions_.get(i));
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(4, authToken_);
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
                        .computeInt32Size(1, eLaunchResult_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, streamPort_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < launchOptions_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeInt32SizeNoTag(launchOptions_.get(i));
                }
                size += dataSize;
                size += 1 * getLaunchOptionsList().size();
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, authToken_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse prototype) {
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
         * Protobuf type {@code CMsgRemoteClientStartStreamResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStreamResponse_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStreamResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.class, SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.newBuilder()
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
                eLaunchResult_ = 2;
                bitField0_ = (bitField0_ & ~0x00000001);
                streamPort_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                launchOptions_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000004);
                authToken_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStartStreamResponse_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse build() {
                SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse result = new SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.eLaunchResult_ = eLaunchResult_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.streamPort_ = streamPort_;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                    launchOptions_ = java.util.Collections.unmodifiableList(launchOptions_);
                    bitField0_ = (bitField0_ & ~0x00000004);
                }
                result.launchOptions_ = launchOptions_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.authToken_ = authToken_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse.getDefaultInstance()) return this;
                if (other.hasELaunchResult()) {
                    setELaunchResult(other.getELaunchResult());
                }
                if (other.hasStreamPort()) {
                    setStreamPort(other.getStreamPort());
                }
                if (!other.launchOptions_.isEmpty()) {
                    if (launchOptions_.isEmpty()) {
                        launchOptions_ = other.launchOptions_;
                        bitField0_ = (bitField0_ & ~0x00000004);
                    } else {
                        ensureLaunchOptionsIsMutable();
                        launchOptions_.addAll(other.launchOptions_);
                    }
                    onChanged();
                }
                if (other.hasAuthToken()) {
                    setAuthToken(other.getAuthToken());
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
                SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientStartStreamResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional int32 e_launch_result = 1 [default = 2];
            private int eLaunchResult_ = 2;
            /**
             * <code>optional int32 e_launch_result = 1 [default = 2];</code>
             */
            public boolean hasELaunchResult() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional int32 e_launch_result = 1 [default = 2];</code>
             */
            public int getELaunchResult() {
                return eLaunchResult_;
            }
            /**
             * <code>optional int32 e_launch_result = 1 [default = 2];</code>
             */
            public Builder setELaunchResult(int value) {
                bitField0_ |= 0x00000001;
                eLaunchResult_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 e_launch_result = 1 [default = 2];</code>
             */
            public Builder clearELaunchResult() {
                bitField0_ = (bitField0_ & ~0x00000001);
                eLaunchResult_ = 2;
                onChanged();
                return this;
            }
            // optional uint32 stream_port = 2;
            private int streamPort_ ;
            /**
             * <code>optional uint32 stream_port = 2;</code>
             */
            public boolean hasStreamPort() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint32 stream_port = 2;</code>
             */
            public int getStreamPort() {
                return streamPort_;
            }
            /**
             * <code>optional uint32 stream_port = 2;</code>
             */
            public Builder setStreamPort(int value) {
                bitField0_ |= 0x00000002;
                streamPort_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 stream_port = 2;</code>
             */
            public Builder clearStreamPort() {
                bitField0_ = (bitField0_ & ~0x00000002);
                streamPort_ = 0;
                onChanged();
                return this;
            }
            // repeated int32 launch_options = 3;
            private java.util.List<java.lang.Integer> launchOptions_ = java.util.Collections.emptyList();
            private void ensureLaunchOptionsIsMutable() {
                if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                    launchOptions_ = new java.util.ArrayList<java.lang.Integer>(launchOptions_);
                    bitField0_ |= 0x00000004;
                }
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public java.util.List<java.lang.Integer>
            getLaunchOptionsList() {
                return java.util.Collections.unmodifiableList(launchOptions_);
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public int getLaunchOptionsCount() {
                return launchOptions_.size();
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public int getLaunchOptions(int index) {
                return launchOptions_.get(index);
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public Builder setLaunchOptions(
                    int index, int value) {
                ensureLaunchOptionsIsMutable();
                launchOptions_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public Builder addLaunchOptions(int value) {
                ensureLaunchOptionsIsMutable();
                launchOptions_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public Builder addAllLaunchOptions(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureLaunchOptionsIsMutable();
                super.addAll(values, launchOptions_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 launch_options = 3;</code>
             */
            public Builder clearLaunchOptions() {
                launchOptions_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000004);
                onChanged();
                return this;
            }
            // optional bytes auth_token = 4;
            private com.google.protobuf.ByteString authToken_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes auth_token = 4;</code>
             */
            public boolean hasAuthToken() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional bytes auth_token = 4;</code>
             */
            public com.google.protobuf.ByteString getAuthToken() {
                return authToken_;
            }
            /**
             * <code>optional bytes auth_token = 4;</code>
             */
            public Builder setAuthToken(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                authToken_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes auth_token = 4;</code>
             */
            public Builder clearAuthToken() {
                bitField0_ = (bitField0_ & ~0x00000008);
                authToken_ = getDefaultInstance().getAuthToken();
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientStartStreamResponse)
        }
        static {
            defaultInstance = new CMsgRemoteClientStartStreamResponse(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientStartStreamResponse)
    }
    public interface CMsgRemoteClientPingOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code CMsgRemoteClientPing}
     */
    public static final class CMsgRemoteClientPing extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientPingOrBuilder {
        // Use CMsgRemoteClientPing.newBuilder() to construct.
        private CMsgRemoteClientPing(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientPing(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientPing defaultInstance;
        public static CMsgRemoteClientPing getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientPing getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientPing(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPing_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPing_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientPing.class, SteamMsgRemoteClient.CMsgRemoteClientPing.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientPing> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientPing>() {
                    public CMsgRemoteClientPing parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientPing(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientPing> getParserForType() {
            return PARSER;
        }
        private void initFields() {
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
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
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
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPing parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientPing prototype) {
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
         * Protobuf type {@code CMsgRemoteClientPing}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientPingOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPing_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPing_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientPing.class, SteamMsgRemoteClient.CMsgRemoteClientPing.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientPing.newBuilder()
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
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPing_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientPing getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientPing.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientPing build() {
                SteamMsgRemoteClient.CMsgRemoteClientPing result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientPing buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientPing result = new SteamMsgRemoteClient.CMsgRemoteClientPing(this);
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientPing) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientPing)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientPing other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientPing.getDefaultInstance()) return this;
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
                SteamMsgRemoteClient.CMsgRemoteClientPing parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientPing) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientPing)
        }
        static {
            defaultInstance = new CMsgRemoteClientPing(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientPing)
    }
    public interface CMsgRemoteClientPingResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code CMsgRemoteClientPingResponse}
     */
    public static final class CMsgRemoteClientPingResponse extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientPingResponseOrBuilder {
        // Use CMsgRemoteClientPingResponse.newBuilder() to construct.
        private CMsgRemoteClientPingResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientPingResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientPingResponse defaultInstance;
        public static CMsgRemoteClientPingResponse getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientPingResponse getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientPingResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPingResponse_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPingResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientPingResponse.class, SteamMsgRemoteClient.CMsgRemoteClientPingResponse.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientPingResponse> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientPingResponse>() {
                    public CMsgRemoteClientPingResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientPingResponse(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientPingResponse> getParserForType() {
            return PARSER;
        }
        private void initFields() {
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
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
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
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientPingResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientPingResponse prototype) {
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
         * Protobuf type {@code CMsgRemoteClientPingResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientPingResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPingResponse_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPingResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientPingResponse.class, SteamMsgRemoteClient.CMsgRemoteClientPingResponse.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientPingResponse.newBuilder()
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
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientPingResponse_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientPingResponse getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientPingResponse.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientPingResponse build() {
                SteamMsgRemoteClient.CMsgRemoteClientPingResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientPingResponse buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientPingResponse result = new SteamMsgRemoteClient.CMsgRemoteClientPingResponse(this);
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientPingResponse) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientPingResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientPingResponse other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientPingResponse.getDefaultInstance()) return this;
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
                SteamMsgRemoteClient.CMsgRemoteClientPingResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientPingResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientPingResponse)
        }
        static {
            defaultInstance = new CMsgRemoteClientPingResponse(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientPingResponse)
    }
    public interface CMsgRemoteClientAcceptEULAOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// repeated uint32 app_id = 1;
        /**
         * <code>repeated uint32 app_id = 1;</code>
         */
        java.util.List<java.lang.Integer> getAppIdList();
        /**
         * <code>repeated uint32 app_id = 1;</code>
         */
        int getAppIdCount();
        /**
         * <code>repeated uint32 app_id = 1;</code>
         */
        int getAppId(int index);
    }
    /**
     * Protobuf type {@code CMsgRemoteClientAcceptEULA}
     */
    public static final class CMsgRemoteClientAcceptEULA extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientAcceptEULAOrBuilder {
        // Use CMsgRemoteClientAcceptEULA.newBuilder() to construct.
        private CMsgRemoteClientAcceptEULA(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientAcceptEULA(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientAcceptEULA defaultInstance;
        public static CMsgRemoteClientAcceptEULA getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientAcceptEULA getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientAcceptEULA(
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
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                appId_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            appId_.add(input.readUInt32());
                            break;
                        }
                        case 10: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                                appId_ = new java.util.ArrayList<java.lang.Integer>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                appId_.add(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    appId_ = java.util.Collections.unmodifiableList(appId_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAcceptEULA_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAcceptEULA_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.class, SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientAcceptEULA> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientAcceptEULA>() {
                    public CMsgRemoteClientAcceptEULA parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientAcceptEULA(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientAcceptEULA> getParserForType() {
            return PARSER;
        }
        // repeated uint32 app_id = 1;
        public static final int APP_ID_FIELD_NUMBER = 1;
        private java.util.List<java.lang.Integer> appId_;
        /**
         * <code>repeated uint32 app_id = 1;</code>
         */
        public java.util.List<java.lang.Integer>
        getAppIdList() {
            return appId_;
        }
        /**
         * <code>repeated uint32 app_id = 1;</code>
         */
        public int getAppIdCount() {
            return appId_.size();
        }
        /**
         * <code>repeated uint32 app_id = 1;</code>
         */
        public int getAppId(int index) {
            return appId_.get(index);
        }
        private void initFields() {
            appId_ = java.util.Collections.emptyList();
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
            for (int i = 0; i < appId_.size(); i++) {
                output.writeUInt32(1, appId_.get(i));
            }
            getUnknownFields().writeTo(output);
        }
        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < appId_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                            .computeUInt32SizeNoTag(appId_.get(i));
                }
                size += dataSize;
                size += 1 * getAppIdList().size();
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
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA prototype) {
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
         * Protobuf type {@code CMsgRemoteClientAcceptEULA}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientAcceptEULAOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAcceptEULA_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAcceptEULA_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.class, SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.newBuilder()
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
                appId_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientAcceptEULA_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA build() {
                SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA result = new SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    appId_ = java.util.Collections.unmodifiableList(appId_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.appId_ = appId_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA.getDefaultInstance()) return this;
                if (!other.appId_.isEmpty()) {
                    if (appId_.isEmpty()) {
                        appId_ = other.appId_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureAppIdIsMutable();
                        appId_.addAll(other.appId_);
                    }
                    onChanged();
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
                SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientAcceptEULA) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // repeated uint32 app_id = 1;
            private java.util.List<java.lang.Integer> appId_ = java.util.Collections.emptyList();
            private void ensureAppIdIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    appId_ = new java.util.ArrayList<java.lang.Integer>(appId_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public java.util.List<java.lang.Integer>
            getAppIdList() {
                return java.util.Collections.unmodifiableList(appId_);
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public int getAppIdCount() {
                return appId_.size();
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public int getAppId(int index) {
                return appId_.get(index);
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public Builder setAppId(
                    int index, int value) {
                ensureAppIdIsMutable();
                appId_.set(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public Builder addAppId(int value) {
                ensureAppIdIsMutable();
                appId_.add(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public Builder addAllAppId(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureAppIdIsMutable();
                super.addAll(values, appId_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 app_id = 1;</code>
             */
            public Builder clearAppId() {
                appId_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientAcceptEULA)
        }
        static {
            defaultInstance = new CMsgRemoteClientAcceptEULA(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientAcceptEULA)
    }
    public interface CMsgRemoteClientGetControllerConfigOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional uint32 app_id = 1;
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        boolean hasAppId();
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        int getAppId();
// optional int32 window_type = 2;
        /**
         * <code>optional int32 window_type = 2;</code>
         */
        boolean hasWindowType();
        /**
         * <code>optional int32 window_type = 2;</code>
         */
        int getWindowType();
// optional uint32 controller_index = 3;
        /**
         * <code>optional uint32 controller_index = 3;</code>
         */
        boolean hasControllerIndex();
        /**
         * <code>optional uint32 controller_index = 3;</code>
         */
        int getControllerIndex();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientGetControllerConfig}
     */
    public static final class CMsgRemoteClientGetControllerConfig extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientGetControllerConfigOrBuilder {
        // Use CMsgRemoteClientGetControllerConfig.newBuilder() to construct.
        private CMsgRemoteClientGetControllerConfig(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientGetControllerConfig(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientGetControllerConfig defaultInstance;
        public static CMsgRemoteClientGetControllerConfig getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientGetControllerConfig getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientGetControllerConfig(
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
                            appId_ = input.readUInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            windowType_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            controllerIndex_ = input.readUInt32();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfig_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfig_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.class, SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientGetControllerConfig> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientGetControllerConfig>() {
                    public CMsgRemoteClientGetControllerConfig parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientGetControllerConfig(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientGetControllerConfig> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional uint32 app_id = 1;
        public static final int APP_ID_FIELD_NUMBER = 1;
        private int appId_;
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        public boolean hasAppId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 app_id = 1;</code>
         */
        public int getAppId() {
            return appId_;
        }
        // optional int32 window_type = 2;
        public static final int WINDOW_TYPE_FIELD_NUMBER = 2;
        private int windowType_;
        /**
         * <code>optional int32 window_type = 2;</code>
         */
        public boolean hasWindowType() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional int32 window_type = 2;</code>
         */
        public int getWindowType() {
            return windowType_;
        }
        // optional uint32 controller_index = 3;
        public static final int CONTROLLER_INDEX_FIELD_NUMBER = 3;
        private int controllerIndex_;
        /**
         * <code>optional uint32 controller_index = 3;</code>
         */
        public boolean hasControllerIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint32 controller_index = 3;</code>
         */
        public int getControllerIndex() {
            return controllerIndex_;
        }
        private void initFields() {
            appId_ = 0;
            windowType_ = 0;
            controllerIndex_ = 0;
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
                output.writeUInt32(1, appId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, windowType_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt32(3, controllerIndex_);
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
                        .computeUInt32Size(1, appId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, windowType_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, controllerIndex_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig prototype) {
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
         * Protobuf type {@code CMsgRemoteClientGetControllerConfig}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfig_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfig_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.class, SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.newBuilder()
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
                appId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                windowType_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                controllerIndex_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfig_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig build() {
                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig result = new SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.appId_ = appId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.windowType_ = windowType_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.controllerIndex_ = controllerIndex_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig.getDefaultInstance()) return this;
                if (other.hasAppId()) {
                    setAppId(other.getAppId());
                }
                if (other.hasWindowType()) {
                    setWindowType(other.getWindowType());
                }
                if (other.hasControllerIndex()) {
                    setControllerIndex(other.getControllerIndex());
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
                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfig) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional uint32 app_id = 1;
            private int appId_ ;
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public boolean hasAppId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public int getAppId() {
                return appId_;
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public Builder setAppId(int value) {
                bitField0_ |= 0x00000001;
                appId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 app_id = 1;</code>
             */
            public Builder clearAppId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                appId_ = 0;
                onChanged();
                return this;
            }
            // optional int32 window_type = 2;
            private int windowType_ ;
            /**
             * <code>optional int32 window_type = 2;</code>
             */
            public boolean hasWindowType() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional int32 window_type = 2;</code>
             */
            public int getWindowType() {
                return windowType_;
            }
            /**
             * <code>optional int32 window_type = 2;</code>
             */
            public Builder setWindowType(int value) {
                bitField0_ |= 0x00000002;
                windowType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 window_type = 2;</code>
             */
            public Builder clearWindowType() {
                bitField0_ = (bitField0_ & ~0x00000002);
                windowType_ = 0;
                onChanged();
                return this;
            }
            // optional uint32 controller_index = 3;
            private int controllerIndex_ ;
            /**
             * <code>optional uint32 controller_index = 3;</code>
             */
            public boolean hasControllerIndex() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint32 controller_index = 3;</code>
             */
            public int getControllerIndex() {
                return controllerIndex_;
            }
            /**
             * <code>optional uint32 controller_index = 3;</code>
             */
            public Builder setControllerIndex(int value) {
                bitField0_ |= 0x00000004;
                controllerIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 controller_index = 3;</code>
             */
            public Builder clearControllerIndex() {
                bitField0_ = (bitField0_ & ~0x00000004);
                controllerIndex_ = 0;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientGetControllerConfig)
        }
        static {
            defaultInstance = new CMsgRemoteClientGetControllerConfig(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientGetControllerConfig)
    }
    public interface CMsgRemoteClientGetControllerConfigResponseOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// optional int32 eresult = 1 [default = 2];
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        boolean hasEresult();
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        int getEresult();
// optional bytes config_vdf = 2;
        /**
         * <code>optional bytes config_vdf = 2;</code>
         */
        boolean hasConfigVdf();
        /**
         * <code>optional bytes config_vdf = 2;</code>
         */
        com.google.protobuf.ByteString getConfigVdf();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientGetControllerConfigResponse}
     */
    public static final class CMsgRemoteClientGetControllerConfigResponse extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientGetControllerConfigResponseOrBuilder {
        // Use CMsgRemoteClientGetControllerConfigResponse.newBuilder() to construct.
        private CMsgRemoteClientGetControllerConfigResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientGetControllerConfigResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientGetControllerConfigResponse defaultInstance;
        public static CMsgRemoteClientGetControllerConfigResponse getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientGetControllerConfigResponse getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientGetControllerConfigResponse(
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
                            eresult_ = input.readInt32();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            configVdf_ = input.readBytes();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfigResponse_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfigResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.class, SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientGetControllerConfigResponse> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientGetControllerConfigResponse>() {
                    public CMsgRemoteClientGetControllerConfigResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientGetControllerConfigResponse(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientGetControllerConfigResponse> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // optional int32 eresult = 1 [default = 2];
        public static final int ERESULT_FIELD_NUMBER = 1;
        private int eresult_;
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        public boolean hasEresult() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional int32 eresult = 1 [default = 2];</code>
         */
        public int getEresult() {
            return eresult_;
        }
        // optional bytes config_vdf = 2;
        public static final int CONFIG_VDF_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString configVdf_;
        /**
         * <code>optional bytes config_vdf = 2;</code>
         */
        public boolean hasConfigVdf() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bytes config_vdf = 2;</code>
         */
        public com.google.protobuf.ByteString getConfigVdf() {
            return configVdf_;
        }
        private void initFields() {
            eresult_ = 2;
            configVdf_ = com.google.protobuf.ByteString.EMPTY;
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
                output.writeInt32(1, eresult_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, configVdf_);
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
                        .computeInt32Size(1, eresult_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, configVdf_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse prototype) {
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
         * Protobuf type {@code CMsgRemoteClientGetControllerConfigResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfigResponse_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfigResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.class, SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.newBuilder()
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
                eresult_ = 2;
                bitField0_ = (bitField0_ & ~0x00000001);
                configVdf_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientGetControllerConfigResponse_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse build() {
                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse result = new SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.eresult_ = eresult_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.configVdf_ = configVdf_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse.getDefaultInstance()) return this;
                if (other.hasEresult()) {
                    setEresult(other.getEresult());
                }
                if (other.hasConfigVdf()) {
                    setConfigVdf(other.getConfigVdf());
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
                SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientGetControllerConfigResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // optional int32 eresult = 1 [default = 2];
            private int eresult_ = 2;
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public boolean hasEresult() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public int getEresult() {
                return eresult_;
            }
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public Builder setEresult(int value) {
                bitField0_ |= 0x00000001;
                eresult_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional int32 eresult = 1 [default = 2];</code>
             */
            public Builder clearEresult() {
                bitField0_ = (bitField0_ & ~0x00000001);
                eresult_ = 2;
                onChanged();
                return this;
            }
            // optional bytes config_vdf = 2;
            private com.google.protobuf.ByteString configVdf_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes config_vdf = 2;</code>
             */
            public boolean hasConfigVdf() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bytes config_vdf = 2;</code>
             */
            public com.google.protobuf.ByteString getConfigVdf() {
                return configVdf_;
            }
            /**
             * <code>optional bytes config_vdf = 2;</code>
             */
            public Builder setConfigVdf(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                configVdf_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes config_vdf = 2;</code>
             */
            public Builder clearConfigVdf() {
                bitField0_ = (bitField0_ & ~0x00000002);
                configVdf_ = getDefaultInstance().getConfigVdf();
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientGetControllerConfigResponse)
        }
        static {
            defaultInstance = new CMsgRemoteClientGetControllerConfigResponse(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientGetControllerConfigResponse)
    }
    public interface CMsgRemoteClientStreamingEnabledOrBuilder
            extends com.google.protobuf.MessageOrBuilder {
// required bool enabled = 1;
        /**
         * <code>required bool enabled = 1;</code>
         */
        boolean hasEnabled();
        /**
         * <code>required bool enabled = 1;</code>
         */
        boolean getEnabled();
    }
    /**
     * Protobuf type {@code CMsgRemoteClientStreamingEnabled}
     */
    public static final class CMsgRemoteClientStreamingEnabled extends
            com.google.protobuf.GeneratedMessage
            implements CMsgRemoteClientStreamingEnabledOrBuilder {
        // Use CMsgRemoteClientStreamingEnabled.newBuilder() to construct.
        private CMsgRemoteClientStreamingEnabled(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private CMsgRemoteClientStreamingEnabled(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }
        private static final CMsgRemoteClientStreamingEnabled defaultInstance;
        public static CMsgRemoteClientStreamingEnabled getDefaultInstance() {
            return defaultInstance;
        }
        public CMsgRemoteClientStreamingEnabled getDefaultInstanceForType() {
            return defaultInstance;
        }
        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CMsgRemoteClientStreamingEnabled(
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
                            enabled_ = input.readBool();
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
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStreamingEnabled_descriptor;
        }
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStreamingEnabled_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.class, SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.Builder.class);
        }
        public static com.google.protobuf.Parser<CMsgRemoteClientStreamingEnabled> PARSER =
                new com.google.protobuf.AbstractParser<CMsgRemoteClientStreamingEnabled>() {
                    public CMsgRemoteClientStreamingEnabled parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CMsgRemoteClientStreamingEnabled(input, extensionRegistry);
                    }
                };
        @java.lang.Override
        public com.google.protobuf.Parser<CMsgRemoteClientStreamingEnabled> getParserForType() {
            return PARSER;
        }
        private int bitField0_;
        // required bool enabled = 1;
        public static final int ENABLED_FIELD_NUMBER = 1;
        private boolean enabled_;
        /**
         * <code>required bool enabled = 1;</code>
         */
        public boolean hasEnabled() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>required bool enabled = 1;</code>
         */
        public boolean getEnabled() {
            return enabled_;
        }
        private void initFields() {
            enabled_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;
            if (!hasEnabled()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBool(1, enabled_);
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
                        .computeBoolSize(1, enabled_);
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
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static Builder newBuilder() { return Builder.create(); }
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder(SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled prototype) {
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
         * Protobuf type {@code CMsgRemoteClientStreamingEnabled}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabledOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStreamingEnabled_descriptor;
            }
            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStreamingEnabled_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.class, SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.Builder.class);
            }
            // Construct using SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.newBuilder()
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
                enabled_ = false;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return SteamMsgRemoteClient.internal_static_CMsgRemoteClientStreamingEnabled_descriptor;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled getDefaultInstanceForType() {
                return SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.getDefaultInstance();
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled build() {
                SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }
            public SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled buildPartial() {
                SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled result = new SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.enabled_ = enabled_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled) {
                    return mergeFrom((SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }
            public Builder mergeFrom(SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled other) {
                if (other == SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled.getDefaultInstance()) return this;
                if (other.hasEnabled()) {
                    setEnabled(other.getEnabled());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }
            public final boolean isInitialized() {
                if (!hasEnabled()) {
                    return false;
                }
                return true;
            }
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SteamMsgRemoteClient.CMsgRemoteClientStreamingEnabled) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;
            // required bool enabled = 1;
            private boolean enabled_ ;
            /**
             * <code>required bool enabled = 1;</code>
             */
            public boolean hasEnabled() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>required bool enabled = 1;</code>
             */
            public boolean getEnabled() {
                return enabled_;
            }
            /**
             * <code>required bool enabled = 1;</code>
             */
            public Builder setEnabled(boolean value) {
                bitField0_ |= 0x00000001;
                enabled_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required bool enabled = 1;</code>
             */
            public Builder clearEnabled() {
                bitField0_ = (bitField0_ & ~0x00000001);
                enabled_ = false;
                onChanged();
                return this;
            }
// @@protoc_insertion_point(builder_scope:CMsgRemoteClientStreamingEnabled)
        }
        static {
            defaultInstance = new CMsgRemoteClientStreamingEnabled(true);
            defaultInstance.initFields();
        }
// @@protoc_insertion_point(class_scope:CMsgRemoteClientStreamingEnabled)
    }
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientBroadcastHeader_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientBroadcastHeader_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientBroadcastStatus_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientBroadcastStatus_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientBroadcastStatus_User_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientBroadcastStatus_User_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientBroadcastDiscovery_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientBroadcastDiscovery_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAppStatus_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAppStatus_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAppStatus_AppStatus_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAppStatus_AppStatus_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAuth_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAuth_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAuthResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAuthResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientStartStream_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientStartStream_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientStartStreamResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientStartStreamResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientPing_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientPing_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientPingResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientPingResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientAcceptEULA_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientAcceptEULA_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientGetControllerConfig_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientGetControllerConfig_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientGetControllerConfigResponse_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientGetControllerConfigResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_CMsgRemoteClientStreamingEnabled_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_CMsgRemoteClientStreamingEnabled_fieldAccessorTable;
    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\032SteamMsgRemoteClient.proto\032\030steammessa" +
                        "ges_base.proto\"\210\001\n\037CMsgRemoteClientBroad" +
                        "castHeader\022\021\n\tclient_id\030\001 \001(\004\022R\n\010msg_typ" +
                        "e\030\002 \001(\0162\032.ERemoteClientBroadcastMsg:$k_E" +
                        "RemoteClientBroadcastMsgDiscovery\"\265\002\n\037CM" +
                        "sgRemoteClientBroadcastStatus\022\017\n\007version" +
                        "\030\001 \001(\005\022\023\n\013min_version\030\002 \001(\005\022\024\n\014connect_p" +
                        "ort\030\003 \001(\r\022\020\n\010hostname\030\004 \001(\t\022\030\n\020enabled_s" +
                        "ervices\030\006 \001(\r\022\021\n\006ostype\030\007 \001(\005:\0010\022\026\n\007is64" +
                        "bit\030\010 \001(\010:\005false\0224\n\005users\030\t \003(\0132%.CMsgRe",
                "moteClientBroadcastStatus.User\022\033\n\023remote" +
                        "_control_port\030\n \001(\r\032,\n\004User\022\017\n\007steamid\030\001" +
                        " \001(\006\022\023\n\013auth_key_id\030\002 \001(\r\"5\n\"CMsgRemoteC" +
                        "lientBroadcastDiscovery\022\017\n\007seq_num\030\001 \001(\r" +
                        "\"\236\004\n\031CMsgRemoteClientAppStatus\022<\n\016status" +
                        "_updates\030\001 \003(\0132$.CMsgRemoteClientAppStat" +
                        "us.AppStatus\032\322\001\n\rAppUpdateInfo\022\031\n\021time_u" +
                        "pdate_start\030\001 \001(\007\022\031\n\021bytes_to_download\030\002" +
                        " \001(\004\022\030\n\020bytes_downloaded\030\003 \001(\004\022\030\n\020bytes_" +
                        "to_process\030\004 \001(\004\022\027\n\017bytes_processed\030\005 \001(",
                "\004\022\'\n\033estimated_seconds_remaining\030\006 \001(\005:\002" +
                        "-1\022\025\n\rupdate_result\030\007 \001(\005\032>\n\014ShortcutInf" +
                        "o\022\014\n\004name\030\001 \001(\t\022\014\n\004icon\030\002 \001(\t\022\022\n\ncategor" +
                        "ies\030\003 \003(\t\032\255\001\n\tAppStatus\022\016\n\006app_id\030\001 \001(\r\022" +
                        "\021\n\tapp_state\030\002 \001(\r\022=\n\013update_info\030\003 \001(\0132" +
                        "(.CMsgRemoteClientAppStatus.AppUpdateInf" +
                        "o\022>\n\rshortcut_info\030\004 \001(\0132\'.CMsgRemoteCli" +
                        "entAppStatus.ShortcutInfo\"[\n\024CMsgRemoteC" +
                        "lientAuth\022\021\n\tclient_id\030\001 \001(\004\0220\n\006status\030\002" +
                        " \001(\0132 .CMsgRemoteClientBroadcastStatus\"2",
                "\n\034CMsgRemoteClientAuthResponse\022\022\n\007eresul" +
                        "t\030\001 \001(\005:\0012\"\361\001\n\033CMsgRemoteClientStartStre" +
                        "am\022\016\n\006app_id\030\001 \001(\r\022\023\n\013environment\030\002 \001(\005\022" +
                        "\025\n\rgamepad_count\030\003 \001(\005\022\031\n\rlaunch_option\030" +
                        "\004 \001(\005:\002-1\022!\n\022lock_parental_lock\030\005 \001(\010:\005f" +
                        "alse\022\034\n\024unlock_parental_lock\030\006 \001(\t\022\034\n\024ma" +
                        "ximum_resolution_x\030\007 \001(\005\022\034\n\024maximum_reso" +
                        "lution_y\030\010 \001(\005\"\202\001\n#CMsgRemoteClientStart" +
                        "StreamResponse\022\032\n\017e_launch_result\030\001 \001(\005:" +
                        "\0012\022\023\n\013stream_port\030\002 \001(\r\022\026\n\016launch_option",
                "s\030\003 \003(\005\022\022\n\nauth_token\030\004 \001(\014\"\026\n\024CMsgRemot" +
                        "eClientPing\"\036\n\034CMsgRemoteClientPingRespo" +
                        "nse\",\n\032CMsgRemoteClientAcceptEULA\022\016\n\006app" +
                        "_id\030\001 \003(\r\"d\n#CMsgRemoteClientGetControll" +
                        "erConfig\022\016\n\006app_id\030\001 \001(\r\022\023\n\013window_type\030" +
                        "\002 \001(\005\022\030\n\020controller_index\030\003 \001(\r\"U\n+CMsgR" +
                        "emoteClientGetControllerConfigResponse\022\022" +
                        "\n\007eresult\030\001 \001(\005:\0012\022\022\n\nconfig_vdf\030\002 \001(\014\"3" +
                        "\n CMsgRemoteClientStreamingEnabled\022\017\n\007en" +
                        "abled\030\001 \002(\010*\224\001\n\031ERemoteClientBroadcastMs",
                "g\022(\n$k_ERemoteClientBroadcastMsgDiscover" +
                        "y\020\000\022%\n!k_ERemoteClientBroadcastMsgStatus" +
                        "\020\001\022&\n\"k_ERemoteClientBroadcastMsgOffline" +
                        "\020\002*\210\001\n\024ERemoteClientService\022\036\n\032k_ERemote" +
                        "ClientServiceNone\020\000\022\'\n#k_ERemoteClientSe" +
                        "rviceRemoteControl\020\001\022\'\n#k_ERemoteClientS" +
                        "erviceGameStreaming\020\002B7\n\037net.zhuoweizhan" +
                        "g.varodahn.protoB\024SteamMsgRemoteClient"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_CMsgRemoteClientBroadcastHeader_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_CMsgRemoteClientBroadcastHeader_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientBroadcastHeader_descriptor,
                                new java.lang.String[] { "ClientId", "MsgType", });
                        internal_static_CMsgRemoteClientBroadcastStatus_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_CMsgRemoteClientBroadcastStatus_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientBroadcastStatus_descriptor,
                                new java.lang.String[] { "Version", "MinVersion", "ConnectPort", "Hostname", "EnabledServices", "Ostype", "Is64Bit", "Users", "RemoteControlPort", });
                        internal_static_CMsgRemoteClientBroadcastStatus_User_descriptor =
                                internal_static_CMsgRemoteClientBroadcastStatus_descriptor.getNestedTypes().get(0);
                        internal_static_CMsgRemoteClientBroadcastStatus_User_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientBroadcastStatus_User_descriptor,
                                new java.lang.String[] { "Steamid", "AuthKeyId", });
                        internal_static_CMsgRemoteClientBroadcastDiscovery_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_CMsgRemoteClientBroadcastDiscovery_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientBroadcastDiscovery_descriptor,
                                new java.lang.String[] { "SeqNum", });
                        internal_static_CMsgRemoteClientAppStatus_descriptor =
                                getDescriptor().getMessageTypes().get(3);
                        internal_static_CMsgRemoteClientAppStatus_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAppStatus_descriptor,
                                new java.lang.String[] { "StatusUpdates", });
                        internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_descriptor =
                                internal_static_CMsgRemoteClientAppStatus_descriptor.getNestedTypes().get(0);
                        internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAppStatus_AppUpdateInfo_descriptor,
                                new java.lang.String[] { "TimeUpdateStart", "BytesToDownload", "BytesDownloaded", "BytesToProcess", "BytesProcessed", "EstimatedSecondsRemaining", "UpdateResult", });
                        internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_descriptor =
                                internal_static_CMsgRemoteClientAppStatus_descriptor.getNestedTypes().get(1);
                        internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAppStatus_ShortcutInfo_descriptor,
                                new java.lang.String[] { "Name", "Icon", "Categories", });
                        internal_static_CMsgRemoteClientAppStatus_AppStatus_descriptor =
                                internal_static_CMsgRemoteClientAppStatus_descriptor.getNestedTypes().get(2);
                        internal_static_CMsgRemoteClientAppStatus_AppStatus_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAppStatus_AppStatus_descriptor,
                                new java.lang.String[] { "AppId", "AppState", "UpdateInfo", "ShortcutInfo", });
                        internal_static_CMsgRemoteClientAuth_descriptor =
                                getDescriptor().getMessageTypes().get(4);
                        internal_static_CMsgRemoteClientAuth_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAuth_descriptor,
                                new java.lang.String[] { "ClientId", "Status", });
                        internal_static_CMsgRemoteClientAuthResponse_descriptor =
                                getDescriptor().getMessageTypes().get(5);
                        internal_static_CMsgRemoteClientAuthResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAuthResponse_descriptor,
                                new java.lang.String[] { "Eresult", });
                        internal_static_CMsgRemoteClientStartStream_descriptor =
                                getDescriptor().getMessageTypes().get(6);
                        internal_static_CMsgRemoteClientStartStream_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientStartStream_descriptor,
                                new java.lang.String[] { "AppId", "Environment", "GamepadCount", "LaunchOption", "LockParentalLock", "UnlockParentalLock", "MaximumResolutionX", "MaximumResolutionY", });
                        internal_static_CMsgRemoteClientStartStreamResponse_descriptor =
                                getDescriptor().getMessageTypes().get(7);
                        internal_static_CMsgRemoteClientStartStreamResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientStartStreamResponse_descriptor,
                                new java.lang.String[] { "ELaunchResult", "StreamPort", "LaunchOptions", "AuthToken", });
                        internal_static_CMsgRemoteClientPing_descriptor =
                                getDescriptor().getMessageTypes().get(8);
                        internal_static_CMsgRemoteClientPing_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientPing_descriptor,
                                new java.lang.String[] { });
                        internal_static_CMsgRemoteClientPingResponse_descriptor =
                                getDescriptor().getMessageTypes().get(9);
                        internal_static_CMsgRemoteClientPingResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientPingResponse_descriptor,
                                new java.lang.String[] { });
                        internal_static_CMsgRemoteClientAcceptEULA_descriptor =
                                getDescriptor().getMessageTypes().get(10);
                        internal_static_CMsgRemoteClientAcceptEULA_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientAcceptEULA_descriptor,
                                new java.lang.String[] { "AppId", });
                        internal_static_CMsgRemoteClientGetControllerConfig_descriptor =
                                getDescriptor().getMessageTypes().get(11);
                        internal_static_CMsgRemoteClientGetControllerConfig_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientGetControllerConfig_descriptor,
                                new java.lang.String[] { "AppId", "WindowType", "ControllerIndex", });
                        internal_static_CMsgRemoteClientGetControllerConfigResponse_descriptor =
                                getDescriptor().getMessageTypes().get(12);
                        internal_static_CMsgRemoteClientGetControllerConfigResponse_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientGetControllerConfigResponse_descriptor,
                                new java.lang.String[] { "Eresult", "ConfigVdf", });
                        internal_static_CMsgRemoteClientStreamingEnabled_descriptor =
                                getDescriptor().getMessageTypes().get(13);
                        internal_static_CMsgRemoteClientStreamingEnabled_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_CMsgRemoteClientStreamingEnabled_descriptor,
                                new java.lang.String[] { "Enabled", });
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                                SteamMsgBase.getDescriptor(),
                        }, assigner);
    }
// @@protoc_insertion_point(outer_class_scope)
}