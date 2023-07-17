package ksyun.client.kls.resumestream.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResumeStreamRequest
* @Description 请求参数
*/
@Data
public class ResumeStreamRequest{
    /**域名空间*/
    @KsYunField(name="UniqueName")
    private String UniqueName;

    /**应用名*/
    @KsYunField(name="App")
    private String App;

    /**推流域名*/
    @KsYunField(name="Pubdomain")
    private String Pubdomain;

    /**流名*/
    @KsYunField(name="Stream")
    private String Stream;


}