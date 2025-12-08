package ksyun.client.trade.queryunpayorders.v20250321;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryUnPayOrdersRequest
* @Description 请求参数
*/
@Data
public class QueryUnPayOrdersRequest{
    /**页码，从1开始*/
    @KsYunField(name="page")
    private Integer Page;

    /**每页大小*/
    @KsYunField(name="size")
    private Integer Size;

}
