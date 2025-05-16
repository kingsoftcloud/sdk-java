package ksyun.client.aicp.createjob.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateJobRequest
 * @Description 请求参数
 */
@Data
public class CreateJobRequest {
    /**
     * 空间ID
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

    /**
     * 任务名称
     */
    @KsYunField(name = "name")
    private String Name;

    /**
     * 任务优先级
     * 1: 极高 2: 高 3: 低
     */
    @KsYunField(name = "priority")
    private Integer Priority;

    /**
     * 任务描述
     */
    @KsYunField(name = "description")
    private String Description;

    /**
     * 镜像类型
     * 0：平台镜像（需要传镜像id）
     * 1: 自定义镜像：需要传镜像地址/名称/用户/密码]
     */
    @KsYunField(name = "image_type")
    private Integer Image_type;

    /**
     * 镜像ID
     * image_type = 0时候必须传
     */
    @KsYunField(name = "image_id")
    private Integer Image_id;

    /**
     * 自定义镜像地址
     * image_type = 1时候必须传
     */
    @KsYunField(name = "image_url")
    private String Image_url;

    /**
     * 自定义镜像仓库账号
     * image_type = 1且镜像仓库为私有时候必须传
     */
    @KsYunField(name = "pull_user")
    private String Pull_user;

    /**
     * 自定义镜像仓库密码
     * image_type = 1且镜像仓库为私有时候必须传
     */
    @KsYunField(name = "pull_password")
    private String Pull_password;

    /**
     * 代码来源
     * local：本地代码
     * remote：远程代码
     */
    @KsYunField(name = "code_resource")
    private String Code_resource;

    /**
     * 代码目录
     * 注：使用本地代码时为必填项
     * 使用远程git代码时，代码目录无需填写
     */
    @KsYunField(name = "working_folder")
    private String Working_folder;

    /**
     * 远程代码git地址
     * 使用远程git代码时，需要填写
     */
    @KsYunField(name = "git_url")
    private String Git_url;

    /**
     * 代码分支
     * 使用远程git代码时，需要填写
     */
    @KsYunField(name = "git_branch")
    private String Git_branch;

    /**
     * git账号
     * 使用远程git代码时，需要填写
     */
    @KsYunField(name = "account")
    private String Account;

    /**
     * 登陆凭证
     * 使用远程git代码时，需要填写
     */
    @KsYunField(name = "access_token")
    private String Access_token;

    /**
     * 代码下载目录
     * 注：不允许为根目录（不允许为/）
     */
    @KsYunField(name = "download_path")
    private String Download_path;

    /**
     * 训练启动命令
     */
    @KsYunField(name = "run_command")
    private String Run_command;

    /**
     * 训练类型
     * 目前只有一种 pytorch_ddp
     */
    @KsYunField(name = "training_type")
    private String Training_type;

    /**
     * 是否开启故障自愈
     * 1:开启
     * 0:关闭
     */
    @KsYunField(name = "self_healing")
    private Integer Self_healing;

    /**
     * 故障自愈最大次数
     */
    @KsYunField(name = "max_self_healing_times")
    private Integer Max_self_healing_times;

    /**
     * 任务夯住自愈时间间隔
     * 分钟为单位，不传默认为0，则不处理夯住场景
     */
    @KsYunField(name = "hanging_duration")
    private Integer Hanging_duration;

    /**
     * 训练节点数
     */
    @KsYunField(name = "replicas")
    private Integer Replicas;

    /**
     * 选择的GPU卡类型
     */
    @KsYunField(name = "device_name")
    private String Device_name;

    /**
     * 存储挂载
     */
    @KsYunField(name = "space_storages", type = 2)
    private List<Space_storagesDto> Space_storagesList;

    @Data
    @ToString
    public static class Space_storagesDto {
        /**
         * 存储ID
         * 注：可根据ListSpaceStorages接口查询可用的空间存储列表，查看该接口返回结果中的id字段
         */
        private Integer Space_storage_id;
        /**
         * 挂载路径
         */
        private String Space_storage_location;
    }

    /**
     * 训练任务的环境变量设置
     */
    @KsYunField(name = "env")

    private EnvDto EnvList;

    @Data
    @ToString
    public static class EnvDto {
        /**
         * 环境变量设置字段key值
         */
        @KsYunField(name = "key1")
        private String Key1;
    }
}