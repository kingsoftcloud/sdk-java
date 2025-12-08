package ksyun.client.kce.createrepository.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateRepositoryRequest
* @Description 请求参数
*/
@Data
public class CreateRepositoryRequest{
    /**镜像仓库名称，在这里我们定义reponame是命名空间/仓库，如我们要创建的仓库是nginx，所属命名空间是mynamespace，则reponame为mynamespace/nginx。*/
    @KsYunField(name="RepoName")
    private String RepoName;

    /**镜像仓库描述信息*/
    @KsYunField(name="Description")
    private String Description;

}
