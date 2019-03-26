package za.co.investec.addressparser.domain;

public class Type {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Type)) return false;
        Type type = (Type) o;
        return getCode().equals(type.getCode()) &&
                getName().equals(type.getName());
    }

    @Override
    public String toString() {
        return "Type{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
