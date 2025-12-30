/*
 * Decompiled with CFR 0.152.
 */
package common;

import java.beans.ConstructorProperties;

public class RpcRequestContentModel {
    private String service = "";
    private String region = "";
    private String version = "";
    private String action = "";
    private String accessKeyId = "";
    private String secretAccessKey = "";
    private Integer connectTimeout;
    private Integer socketTimeout;

    private static Integer $default$connectTimeout() {
        return 60000;
    }

    private static Integer $default$socketTimeout() {
        return 60000;
    }

    @ConstructorProperties(value={"service", "region", "version", "action", "accessKeyId", "secretAccessKey", "connectTimeout", "socketTimeout"})
    RpcRequestContentModel(String service, String region, String version, String action, String accessKeyId, String secretAccessKey, Integer connectTimeout, Integer socketTimeout) {
        this.service = service;
        this.region = region;
        this.version = version;
        this.action = action;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.connectTimeout = connectTimeout;
        this.socketTimeout = socketTimeout;
    }

    public static RpcRequestContentModelBuilder builder() {
        return new RpcRequestContentModelBuilder();
    }

    public String getService() {
        return this.service;
    }

    public String getRegion() {
        return this.region;
    }

    public String getVersion() {
        return this.version;
    }

    public String getAction() {
        return this.action;
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public Integer getConnectTimeout() {
        return this.connectTimeout;
    }

    public Integer getSocketTimeout() {
        return this.socketTimeout;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setSocketTimeout(Integer socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RpcRequestContentModel)) {
            return false;
        }
        RpcRequestContentModel other = (RpcRequestContentModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$service = this.getService();
        String other$service = other.getService();
        if (this$service == null ? other$service != null : !this$service.equals(other$service)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$version = this.getVersion();
        String other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
            return false;
        }
        String this$accessKeyId = this.getAccessKeyId();
        String other$accessKeyId = other.getAccessKeyId();
        if (this$accessKeyId == null ? other$accessKeyId != null : !this$accessKeyId.equals(other$accessKeyId)) {
            return false;
        }
        String this$secretAccessKey = this.getSecretAccessKey();
        String other$secretAccessKey = other.getSecretAccessKey();
        if (this$secretAccessKey == null ? other$secretAccessKey != null : !this$secretAccessKey.equals(other$secretAccessKey)) {
            return false;
        }
        Integer this$connectTimeout = this.getConnectTimeout();
        Integer other$connectTimeout = other.getConnectTimeout();
        if (this$connectTimeout == null ? other$connectTimeout != null : !((Object)this$connectTimeout).equals(other$connectTimeout)) {
            return false;
        }
        Integer this$socketTimeout = this.getSocketTimeout();
        Integer other$socketTimeout = other.getSocketTimeout();
        return !(this$socketTimeout == null ? other$socketTimeout != null : !((Object)this$socketTimeout).equals(other$socketTimeout));
    }

    protected boolean canEqual(Object other) {
        return other instanceof RpcRequestContentModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $service = this.getService();
        result = result * 59 + ($service == null ? 43 : $service.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $version = this.getVersion();
        result = result * 59 + ($version == null ? 43 : $version.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $accessKeyId = this.getAccessKeyId();
        result = result * 59 + ($accessKeyId == null ? 43 : $accessKeyId.hashCode());
        String $secretAccessKey = this.getSecretAccessKey();
        result = result * 59 + ($secretAccessKey == null ? 43 : $secretAccessKey.hashCode());
        Integer $connectTimeout = this.getConnectTimeout();
        result = result * 59 + ($connectTimeout == null ? 43 : ((Object)$connectTimeout).hashCode());
        Integer $socketTimeout = this.getSocketTimeout();
        result = result * 59 + ($socketTimeout == null ? 43 : ((Object)$socketTimeout).hashCode());
        return result;
    }

    public String toString() {
        return "RpcRequestContentModel(service=" + this.getService() + ", region=" + this.getRegion() + ", version=" + this.getVersion() + ", action=" + this.getAction() + ", accessKeyId=" + this.getAccessKeyId() + ", secretAccessKey=" + this.getSecretAccessKey() + ", connectTimeout=" + this.getConnectTimeout() + ", socketTimeout=" + this.getSocketTimeout() + ")";
    }

    public static class RpcRequestContentModelBuilder {
        private String service;
        private String region;
        private String version;
        private String action;
        private String accessKeyId;
        private String secretAccessKey;
        private boolean connectTimeout$set;
        private Integer connectTimeout;
        private boolean socketTimeout$set;
        private Integer socketTimeout;

        RpcRequestContentModelBuilder() {
        }

        public RpcRequestContentModelBuilder service(String service) {
            this.service = service;
            return this;
        }

        public RpcRequestContentModelBuilder region(String region) {
            this.region = region;
            return this;
        }

        public RpcRequestContentModelBuilder version(String version) {
            this.version = version;
            return this;
        }

        public RpcRequestContentModelBuilder action(String action) {
            this.action = action;
            return this;
        }

        public RpcRequestContentModelBuilder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        public RpcRequestContentModelBuilder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }

        public RpcRequestContentModelBuilder connectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            this.connectTimeout$set = true;
            return this;
        }

        public RpcRequestContentModelBuilder socketTimeout(Integer socketTimeout) {
            this.socketTimeout = socketTimeout;
            this.socketTimeout$set = true;
            return this;
        }

        public RpcRequestContentModel build() {
            return new RpcRequestContentModel(this.service, this.region, this.version, this.action, this.accessKeyId, this.secretAccessKey, this.connectTimeout$set ? this.connectTimeout : RpcRequestContentModel.$default$connectTimeout(), this.socketTimeout$set ? this.socketTimeout : RpcRequestContentModel.$default$socketTimeout());
        }

        public String toString() {
            return "RpcRequestContentModel.RpcRequestContentModelBuilder(service=" + this.service + ", region=" + this.region + ", version=" + this.version + ", action=" + this.action + ", accessKeyId=" + this.accessKeyId + ", secretAccessKey=" + this.secretAccessKey + ", connectTimeout=" + this.connectTimeout + ", socketTimeout=" + this.socketTimeout + ")";
        }
    }
}

