package ksyun.client.ked.clouddesklist.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CloudDesklistRequest
* @Description 请求参数
*/
@Data
public class CloudDesklistRequest{
    /***/
    @KsYunField(name="page")
    private Integer Page;

    /***/
    @KsYunField(name="size")
    private Integer Size;

    /**on
off*/
    @KsYunField(name="connected")
    private String Connected;


}