package ksyun.client.vpc.deletehavip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteHaVipRequest
* @Description 请求参数
*/
@Data
public class DeleteHaVipRequest{
    /**高可用虚拟IP的ID*/
    @KsYunField(name="HaVipId")
    private String HaVipId;


}