package design.pattern.structure.composite.sample;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 文件夹类(Composite角色)
 */
public class Folder extends Dir {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        mDirList.add(dir);
    }

    @Override
    public void removeDir(Dir dir) {
        mDirList.remove(dir);
    }

    @Override
    public void clear() {
        mDirList.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + "(");
        Iterator<Dir> iterator = mDirList.iterator();
        while (iterator.hasNext()) {
            Dir dir = iterator.next();
            dir.print();
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    @Override
    public List<Dir> getFiles() {
        return mDirList;
    }
}
