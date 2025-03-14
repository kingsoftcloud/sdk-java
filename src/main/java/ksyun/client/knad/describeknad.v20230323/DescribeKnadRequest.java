package ksyun.client.knad.describeknad.v20230323;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeKnadRequest
 * @Description 请求参数
 */
@Data
public class DescribeKnadRequest {
    /**
     * 项目制id
     */
    @KsYunField(name = "ProjectId")
    private List<String> ProjectIdList;

    /***/
    @KsYunField(name = "KnadId")
    private List<String> KnadIdList;

}