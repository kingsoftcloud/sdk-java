/*
 * Decompiled with CFR 0.152.
 */
package common;

import common.Credential;

public class BaseRequestModel {
    private String service;
    private String action;
    private String version;
    private String region;
    private String signature;
    private Credential credential;

    public String getService() {
        return this.service;
    }

    public String getAction() {
        return this.action;
    }

    public String getVersion() {
        return this.version;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSignature() {
        return this.signature;
    }

    public Credential getCredential() {
        return this.credential;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BaseRequestModel)) {
            return false;
        }
        BaseRequestModel other = (BaseRequestModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$service = this.getService();
        String other$service = other.getService();
        if (this$service == null ? other$service != null : !this$service.equals(other$service)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
            return false;
        }
        String this$version = this.getVersion();
        String other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$signature = this.getSignature();
        String other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) {
            return false;
        }
        Credential this$credential = this.getCredential();
        Credential other$credential = other.getCredential();
        return !(this$credential == null ? other$credential != null : !this$credential.equals(other$credential));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseRequestModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $service = this.getService();
        result = result * 59 + ($service == null ? 43 : $service.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $version = this.getVersion();
        result = result * 59 + ($version == null ? 43 : $version.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $signature = this.getSignature();
        result = result * 59 + ($signature == null ? 43 : $signature.hashCode());
        Credential $credential = this.getCredential();
        result = result * 59 + ($credential == null ? 43 : $credential.hashCode());
        return result;
    }

    public String toString() {
        return "BaseRequestModel(service=" + this.getService() + ", action=" + this.getAction() + ", version=" + this.getVersion() + ", region=" + this.getRegion() + ", signature=" + this.getSignature() + ", credential=" + this.getCredential() + ")";
    }
}

