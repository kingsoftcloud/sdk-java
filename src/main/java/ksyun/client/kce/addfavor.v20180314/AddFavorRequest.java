package ksyun.client.kce.addfavor.v20180314;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddFavorRequest
 * @Description 请求参数
 */
@Data
public class AddFavorRequest {
    /**
     * 命名空间/仓库名称，如“mynamespace/myrepo”
     */
    @KsYunField(name = "RepoName")
    private String RepoName;

    /**
     * 收藏的镜像仓库类型，有效值：KSYUN HUB ：收藏的金山云镜像，DOCKER HUB：收藏的docker hub官方镜像
     */
    @KsYunField(name = "RepoType")
    private String RepoType;


}