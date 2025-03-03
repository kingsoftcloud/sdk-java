package ksyun.client.pdns.unbindfdzonevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname UnbindFdZoneVpcRequest
 * @Description 请求参数
 */
@Data
public class UnbindFdZoneVpcRequest {
    /**
     * 要解绑的BindVpcId
     */
    @KsYunField(name = "BindVpcId")
    private List<BindVpcIdDto> BindVpcIdList;

    @Data
    @ToString
    public static class BindVpcIdDto {
    }

}