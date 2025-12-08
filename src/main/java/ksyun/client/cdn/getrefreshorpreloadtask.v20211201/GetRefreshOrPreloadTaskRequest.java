package ksyun.client.cdn.getrefreshorpreloadtask.v20211201;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetRefreshOrPreloadTaskRequest
* @Description 请求参数
*/
@Data
public class GetRefreshOrPreloadTaskRequest{
    /***/
    @KsYunField(name="Action")
    private String Action;

    /***/
    @KsYunField(name="Version")
    private String Version;

}
