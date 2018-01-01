package cn.springcloud.codegen.generator.springcloud.java;

import cn.springcloud.codegen.engine.constant.SkeletonConstant;
import cn.springcloud.codegen.engine.generator.SkeletonJavaGenerator;
import cn.springcloud.codegen.engine.property.SkeletonProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2017/12/23
 * @time: 0:02
 * @description : do some thing
 */
public class ConfigJavaClassGenerator extends SkeletonJavaGenerator{

    public ConfigJavaClassGenerator(String generatePath, String projectType, String prefixTemplatePath, String reducedTemplatePath, SkeletonProperties skeletonProperties) {
        super(generatePath, projectType, prefixTemplatePath, reducedTemplatePath, ConfigJavaClassGenerator.class, skeletonProperties);
    }

    @Override
    protected String getClassName() {
        return "ConfigApplication";
    }

    @Override
    protected boolean isMainCode() {
        return true;
    }

    @Override
    protected String getTemplateName() {
        return "ConfigApplication.java.template";
    }

    @Override
    protected Object getDataModel() {
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put(SkeletonConstant.PACKAGE, getPackage());

        return dataModel;
    }
}
