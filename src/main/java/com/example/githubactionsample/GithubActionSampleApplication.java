package com.example.githubactionsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionSampleApplication.class, args);



 /*       String token = "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";
        String repoSlug = "PoojaBaghel2019/GitHubTestingRepo";
        String repoOwner = "PoojaBaghel2019";
        String repoName = "GitHubTestingRepo";

        System.out.println("Hello world!");

        GitHub github = new GitHubBuilder().withOAuthToken(token).build();
        System.out.println("github connected............... ");
        // Get Repository
        GHRepository repo = github.getRepository(repoSlug);
        System.out.println(repo.getName());*/
        // String workflowId = "4618716235";
/*
        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody = RequestBody.create(null, new byte[0]);
        List<GHWorkflow> ghWorkflowList = repo.listWorkflows().toList();
        GHTag tag = null;
        // get list of tags
        List<GHTag> tagList = repo.listTags().toList();
        if(!tagList.isEmpty() && !Objects.isNull(tagList.get(0))){
            tag = repo.listTags().toList().get(0);
        }
        for(GHWorkflow ghWorkflow : ghWorkflowList){
            System.out.println("GHWorkflow ............... "+ghWorkflow.getName());
            System.out.println("GHWorkflow ............... "+ghWorkflow.getId());
            System.out.println("GHWorkflow ............... "+ghWorkflow.getNodeId());

            //  ghWorkflow.dispatch();
            Request request = new Request.Builder()
                    .url(String.format("https://api.github.com/repos/%s/%s/actions/workflows/%s/dispatches", repoOwner, repoName, ghWorkflow.getId()))
                    .addHeader("Authorization", "Bearer " + token)
                    .post(requestBody)
                    .build();

            Response response = client.newCall(request).execute();
            System.out.println("Workflow response "+response.code());
            if (response.isSuccessful()) {
                System.out.println("Workflow triggered successfully");
            } else {
                System.out.println("Error triggering workflow: " + response.body().string());
            }
        }*/
    }

}
