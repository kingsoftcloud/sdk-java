package ksyun.client.pdns.bindfdzonevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BindFdZoneVpcRequest
* @Description 请求参数
*/
@Data
public class BindFdZoneVpcRequest{
    /**转发Zone的ID*/
    @KsYunField(name="FdZoneId")
    private String FdZoneId;

    /**机房code*/
    @KsYunField(name="RegionName")
    private String RegionName;

    /**要绑定的VpcId*/
    @KsYunField(name="VpcId",type=2)
    private List<VpcIdDto> VpcIdList;

    @Data
    @ToString
    public static class VpcIdDto {
    }

}
