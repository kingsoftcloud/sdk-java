package ksyun.client.knad.inserteips.v20230323;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname InsertEipsRequest
* @Description 请求参数
*/
@Data
public class InsertEipsRequest{
    /***/
    @KsYunField(name="KnadId")
    private String KnadId;

    /**高防实例绑定的eip列表*/
    @KsYunField(name="Ip",type=2)
    private List<String> IpList;

}
