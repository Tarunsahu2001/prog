import java.util.ArraList;
import java.util.list;
public class StringCompression
{
public int compress (char []chars)
	{
	List<pair>pairList=new ArrayList<>();
	pairList.add(new Pair(chars[0],1));
	for( int i=1;i<char.length;i++)
		{
		if (chars[i-1];!=chars[i])
			{
			pairsList.add(new pair(chars[i],1));
			else
				{
				pairList.get(pairList.size()-1).cnt+=1;
				}
			}
			int i=0;
			for (pair pair : pairList)
				{
				chars[i++]=pair.c;
				int cnt=pair.cnt;
				if (cnt>1)
				for (int j=0;j<String.valueOf(cnt).length(0;j++)
				char[i++]=String.valueOf(cnt).charAt(j);
				}
				return i;
		}
		static calss pair
			{
			char c;
			int cnt;
			public pair(char c,int cnt)
				{
				this.c=c;
				this.cnt=cnt;
				}
			}
}

input:- chars["a","a","b","b","c","c","c"]
output:- return 6,["a","2","b","2","c","3"]
