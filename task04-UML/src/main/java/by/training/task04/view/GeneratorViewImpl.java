package by.training.task04.view;



public class GeneratorViewImpl implements GeneratorView{
    private ResourceManager res = ResourceManager.INSTANCE;
    @Override
    public void printGenerated(String fileName) {
        System.out.println(res.getString("message.generated") + fileName);
    }
}
