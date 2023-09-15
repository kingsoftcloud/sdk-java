package ksyun.client.kce.deletefavor.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteFavorRequest
* @Description 请求参数
*/
@Data
public class DeleteFavorRequest{
    /**仓库名称*/
    @KsYunField(name="RepoName")
    private String RepoName;


}