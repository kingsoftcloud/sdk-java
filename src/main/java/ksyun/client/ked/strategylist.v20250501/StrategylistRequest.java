package ksyun.client.ked.strategylist.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname StrategylistRequest
 * @Description 请求参数
 */
@Data
public class StrategylistRequest {
    /**
     * 每页条数
     */
    @KsYunField(name = "size")
    private Integer Size;

    /**
     * 页码数
     */
    @KsYunField(name = "page")
    private Integer Page;

    /**
     * 根据名称模糊查询
     */
    @KsYunField(name = "name")
    private String Name;

}