package ksyun.client.pdns.modifypdnsfdzone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname ModifyPdnsFdZoneRequest
 * @Description 请求参数
 */
@Data
public class ModifyPdnsFdZoneRequest {
    /**
     * 转发Zone的ID
     */
    @KsYunField(name = "FdZoneId")
    private String FdZoneId;

    /**
     * 描述信息
     */
    @KsYunField(name = "Description")
    private String Description;

    /**
     * ForwardIp,此字段若传入即为全量更新
     */
    @KsYunField(name = "ForwardIp")
    private List<ForwardIpDto> ForwardIpList;

    @Data
    @ToString
    public static class ForwardIpDto {
        /**
         * 端口
         */
        @KsYunField(name = "Port")
        private String Port;
        /**
         * 转发zone绑定的IP
         */
        @KsYunField(name = "Ip")
        private String Ip;
    }

}