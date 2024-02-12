package Models;

public class Organization {
    private Long id; //���� �� ����� ���� null, �������� ���� ������ ���� ������ 0, �������� ����� ���� ������ ���� ����������, �������� ����� ���� ������ �������������� �������������
    private String name; //���� �� ����� ���� null, ������ �� ����� ���� ������
    private Coordinates coordinates; //���� �� ����� ���� null
    private java.time.ZonedDateTime creationDate; //���� �� ����� ���� null, �������� ����� ���� ������ �������������� �������������
    private float annualTurnover; //�������� ���� ������ ���� ������ 0
    private OrganizationType type; //���� �� ����� ���� null
    private Address postalAddress; //���� �� ����� ���� null
}
