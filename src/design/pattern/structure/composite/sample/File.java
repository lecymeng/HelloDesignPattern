package design.pattern.structure.composite.sample;

import java.util.List;

/**
 * Created by Weicools on 2017/3/18.
 * <p>
 * desc: 文件类(Leaf角色)
 */
public class File extends Dir {
  public File(String name) {
    super(name);
  }

  @Override
  public void addDir(Dir dir) {
    throw new UnsupportedOperationException("文件不支持该操作");
  }

  @Override
  public void removeDir(Dir dir) {
    throw new UnsupportedOperationException("文件不支持该操作");
  }

  @Override
  public void clear() {
    throw new UnsupportedOperationException("文件不支持该操作");
  }

  @Override
  public void print() {
    System.out.print(getName());
  }

  @Override
  public List<Dir> getFiles() {
    throw new UnsupportedOperationException("文件不支持该操作");
  }
}
