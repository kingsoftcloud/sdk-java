package ksyun.client.slb.createprivatelinkserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePrivateLinkServerRequest
* @Description 请求参数
*/
@Data
public class CreatePrivateLinkServerRequest{
    /**privateLink名称*/
    @KsYunField(name="PrivateLinkServerName")
    private String PrivateLinkServerName;

    /**关联监听器ID*/
    @KsYunField(name="ListenerId")
    private String ListenerId;

    /**PrivateLinkServer的描述*/
    @KsYunField(name="Description")
    private String Description;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**删除保护*/
    @KsYunField(name="DeleteProtection")
    private String DeleteProtection;

}