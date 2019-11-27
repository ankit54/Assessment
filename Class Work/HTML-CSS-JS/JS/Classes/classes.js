class Person{
    constructor(name,age){
        this.name=name
        this.age=age
    }
    getName(){
        return this.name
    }
}
class Teacher extends Person{
    constructor(name,age,subj){
        super(name,age)
        this.subj=subj
    }
    getSubj(){
        return this.subj
    }
}
const person1=new Person("ankit",20)
const person2=new Person("kunal",30)
console.log(person1.name)

let pName=person1.getName()
console.log(pName)


const t1=new Teacher("ankita",20,["JAVA","CSS"])
console.log(t1.name)
console.log(t1.getSubj())






