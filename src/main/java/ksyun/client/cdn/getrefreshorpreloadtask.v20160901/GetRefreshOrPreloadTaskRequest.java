package ksyun.client.cdn.getrefreshorpreloadtask.v20160901;

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
    /**DomainIds*/
    @KsYunField(name="DomainIds")
    private String DomainIds;

}
