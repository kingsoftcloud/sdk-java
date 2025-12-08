package ksyun.client.pdns.unbindfdzonevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UnbindFdZoneVpcRequest
* @Description 请求参数
*/
@Data
public class UnbindFdZoneVpcRequest{
    /**要解绑的BindVpcId*/
    @KsYunField(name="BindVpcId",type=2)
    private List<BindVpcIdDto1> BindVpcIdList;

    @Data
    @ToString
    public static class BindVpcIdDto1 {
    }

}
