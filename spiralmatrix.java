class sprialmatrix {
    
        List<Integer>ans=new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;
        int cls=0;
        int rs=0;
        int re=matrix.length-1;
        int cle=matrix[0].length-1;
        while(cls<=cle && rs<=re){
        for(int i=cls;i<=cle;i++){
            ans.add(matrix[rs][i]);
        }
        rs++;
        for(int i=rs;i<=re;i++){
            ans.add(matrix[i][cle]);
        }
        cle--;
        if(rs<=re){
    
         for(int i=cle;i>=cls;i--){
            ans.add(matrix[re][i]);
        }
        re--;
        }
        if(cls<=cle){
            for(int i=re;i>=rs;i--){
                ans.add(matrix[i][cls]);
            }
            cls++;
        }}
    
    return ans;
    }

