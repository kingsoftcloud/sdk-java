package ksyun.client.waf.modifystoragetime.v20200707;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyStorageTimeRequest
* @Description 请求参数
*/
@Data
public class ModifyStorageTimeRequest{
    /**日志存储时长，取值范围：1天≤高级版≤180天，1天≤企业版≤360天*/
    @KsYunField(name="StorageTime")
    private Integer StorageTime;

}
