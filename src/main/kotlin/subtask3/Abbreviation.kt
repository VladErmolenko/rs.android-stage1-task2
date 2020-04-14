package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val lowcasea=a.toLowerCase()
        val lowcaseb=b.toLowerCase()
        val listofa= lowcasea.split("")
        val listofb= lowcaseb.split("")
        var i=1
        var k=1
        var counter=0
        while(i<=(listofa.size-2)){
            if(listofb[k]==listofa[i])
            {
                k++
                counter++
            }
            i++
        }

        if(counter==(listofb.size-2)&& counter!=0)
        {
            return "YES"
        }
        else{
            return "NO"
        }
    }
}
