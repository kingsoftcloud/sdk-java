package ksyun.client.pdns.createpdnsfdzone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePdnsFdZoneRequest
* @Description 请求参数
*/
@Data
public class CreatePdnsFdZoneRequest{
    /**出站节点的Id*/
    @KsYunField(name="EndPointId")
    private String EndPointId;

    /**转发Zone名称*/
    @KsYunField(name="FdZoneName")
    private String FdZoneName;

    /**描述信息*/
    @KsYunField(name="Description")
    private String Description;

    /**ForwardIp*/
    @KsYunField(name="ForwardIp",type=2)
    private List<ForwardIpDto> ForwardIpList;

    @Data
    @ToString
    public static class ForwardIpDto {
        /**端口*/
        @KsYunField(name="Port")
        private String Port;

        /**转发zone绑定的IP*/
        @KsYunField(name="Ip")
        private String Ip;

    }

}
