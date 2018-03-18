package design.pattern.structure.composite.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 表示文件和文件夹的抽象类(Component角色)
 */
public abstract class Dir {
    //申明List成员变量存储文件夹下所有元素
    protected List<Dir> mDirList = new ArrayList<>();

    //文件名或者文件夹名称
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    /**
     * 添加一个文件或者文件夹
     *
     * @param dir 文件或者文件夹
     */
    public abstract void addDir(Dir dir);

    /**
     * 删除文件或者文件夹
     *
     * @param dir 文件或者文件夹
     */
    public abstract void removeDir(Dir dir);

    /**
     * 情况文件夹下所有元素
     */
    public abstract void clear();

    /**
     * 输出文件夹目录结构
     */
    public abstract void print();

    /**
     * 获取文件夹下所有的文件和子文件夹
     *
     * @return 文件和子文件夹
     */
    public abstract List<Dir> getFiles();

    public String getName() {
        return name;
    }
}
